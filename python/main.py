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
# import random as r
# num=r.randint(1,10)
# print(num)


# while True:
#     guess=int(input("make guess "))

#     if guess==num:
#         print("ur guess is correct ")
#         break
#     elif guess>num:
#         print("ur guess is greater than number")
        
#     else:
#         print("ur guess is smaller than number")


        
# def pallindrom(a):

#     real=a
#     rev=0
#     while a>0:
#         rev=(rev*10) + (a%10)
#         a=a//10
#     print(rev)
#     if rev==real:
#         print("its a pallindrom number.")
#     else:
#         print("its not a pallindrom number.")

# a = int(input("enter the number  "))
# pallindrom(a)

# def pallindrom(str):
#     rev=""
#     for i in range(len(str)-1,-1,-1):
#         rev=rev + str[i]
#     if rev == str:
#         print(f"{str} is pallindrom")
#     else:
#         print(f"{str} is not palindrom")

# pallindrom("namman")


# find greatest number in list 
# l=[4322222222222222222222222,14,33,554,23,1223,777777,8888]
# idx=0
# sIdx=-1
# for i in range(1,len(l)):
#     if l[i] > l[idx]:
#         sIdx = idx 
#         idx = i
#     elif sIdx == -1 or l[i] > l[sIdx]:
#         sIdx = i    
# print(f"greatest number is {l[idx]} and its index is {idx}")   
# print(f"second greatest number is {l[sIdx]} and its index is {sIdx}")   
# 
# DATA IN SET ARE STORED IN HASHING FORM 


# l=[1,1,1,2,2,2,3,3,3,4,4,4]
# d={}
# for i in l:
#     if i in d.keys():
#         d[i]+=1
#     else:
#         d[i]=1
# print(d)


# r= open("text.txt",'x')
# r.write('i am appending some data.')
# r.close

r=open("text.txt",'a')
r.write("add this data also")
r.close
