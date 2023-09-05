from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import color
from webdriver_manager.firefox import GeckoDriverManager
import time
service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/orangehrm")
    print("Page Title is :", driver.title)
    driver.close()