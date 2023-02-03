import requests

def get_holidays(year, country_code):
    url = f"https://feiertage-api.de/api/?jahr={year}&nur_land={country_code}"
    response = requests.get(url)
    if response.status_code == 200:
        holidays = response.json()
        return holidays
    else:
        return {}

holidays = get_holidays(2023, "DE")
print(holidays)
