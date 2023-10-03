from bs4 import BeautifulSoup
import requests
import csv

url = "https://www.kabum.com.br/hardware/processadores/processador-amd"

response = requests.get(url)

if response.status_code == 200:

    soup = BeautifulSoup(response.text, 'html.parser')

    nomes = soup.findAll("span", class_="nameCard")

    precos = soup.findAll("span", class_="priceCard")

    file = open('dados.csv', 'w', newline='')
    writer = csv.writer(file)
    headers = ['Processadores', 'Preços']
    writer.writerow(headers)

    for nome in nomes:
        for preco in precos:
            print (nome.text, preco.text)
            processadores = [nome.text, preco.text]

            file = open('dados.csv', 'a', newline='', encoding='utf-8')
            writer = csv.writer(file)
            writer.writerow(processadores)
            file.close()

else:
    print ("Falha ao Acessar: ", response.status_code)
            


            
    



