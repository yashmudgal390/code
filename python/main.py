# a = int(input("enter the number  "))
# real=a
# rev=0
# while a>0:
#     rev=(rev*10) + (a%10)
#     a=a//10
# print(rev)
# if rev==real:
#     print("its a pallindrom number.")
# else:
#     print("its not a pallindrom number.")


#random number game
import random as r
num=r.randint(1,10)
print(num)


while True:
    guess=int(input("make guess "))

    if guess==num:
        print("ur guess is correct ")
        break
    elif guess>num:
        print("ur guess is greater than number")
        
    else:
        print("ur guess is smaller than number")
        