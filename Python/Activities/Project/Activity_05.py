from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.wait import WebDriverWait

service = FirefoxService(GeckoDriverManager().install())

# start the driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/orangehrm")
    actualTitle = driver.title
    print("The Title of the Page is: ", actualTitle)
    driver.find_element(By.XPATH,"//input[@name='txtUsername']").send_keys("orange")
    driver.find_element(By.XPATH,"//input[@id='txtPassword']").send_keys("orangepassword123")
    driver.find_element(By.ID,"btnLogin").click()
    driver.find_element(By.ID,"menu_pim_viewMyDetails").click()
    driver.find_element(By.ID,"btnSave").click()
    driver.find_element(By.ID,"personal_txtEmpFirstName").clear()
    driver.find_element(By.ID,"personal_txtEmpFirstName").send_keys("ABCD")
    driver.find_element(By.ID,"personal_txtEmpLastName").clear()
    driver.find_element(By.ID,"personal_txtEmpLastName").send_keys("ABCD")
    driver.find_element(By.ID,"personal_optGender_2").click()
    driver.find_element(By.ID,"personal_DOB").clear()
    driver.find_element(By.ID,"personal_DOB").send_keys("1990-01-21")
   # driver.find_element(By.ID,"btnSave").click()
    driver.close()







