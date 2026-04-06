import json
from os import path
import random
import string
from pathlib import Path


class Bank:
    database='data.json'
    data=[]
    try:
        if Path(database).exists():
            with open(database) as file:
                data=json.load(file.read())
    except Exception as e:
        print(e)
    @staticmethod
    def update():
        with open(Bank.database,'w') as fs:
            fs.write(json.dumps(Bank.data))
    
    
    
    
    def createAccount(self):
        info={
            "name": input("enter your name  "),
            "age": int(input("enter your age  ")),
            "email": input("enter your email  "),
            "pin": input("enter your 4 number pin  "),
            "account_number": 1234,
            "balance": 0
        }
        if info['age']<18 or len(str(info["pin"]))!=4:
            print("invalid details")
        else:
            print("account created successfully")
            for i in info:
                print(f"{i} : {info[i]}")
            print(f'your account number is {info["account_number"]}, please remember it for future use')
            
            Bank.data.append(info)

            Bank.update()

user=Bank()

print("press 1 for creating an account")
print("press 2 for depositing money")
print("press 3 for withdrawing money")
print("press 4 for checking balance")
print("press 5 for updating account details")
print("press 6 for closing account")

check = int(input("enter your choice  "))

if check == 1:
    user.createAccount()
