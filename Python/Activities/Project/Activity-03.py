from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager


service = FirefoxService(GeckoDriverManager().install())

# start the driver
with webdriver.Firefox(service=service) as driver:
    driver.get("http://alchemy.hguy.co/orangehrm")
    driver.find_element(By.XPATH,"//input[@name='txtUsername']").send_keys("orange")
    driver.find_element(By.XPATH,"//input[@id='txtPassword']").send_keys("orangepassword123")
    driver.find_element(By.ID,"btnLogin").click()
    wait = WebDriverWait(driver, 5)
    Homepage=driver.title
    print(Homepage)
    assert Homepage,"OrangeHRM"
    driver.close()