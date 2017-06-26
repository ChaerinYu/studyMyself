import requests
from bs4 import BeautifulSoup

url="http://www.daum.net"
html = requests.get(url) #page의 html 가져오기

bs = BeautifulSoup(html.text, "html.parser")

li = bs.find_all("span", class_="txt_issue") #list에 저장

cnt = 1
for a in li[:20:2]: #실검 10위까지만 가져오기
    try:
        print(cnt, "위: ", a.text)
        cnt = cnt+1
    except:
        pass
