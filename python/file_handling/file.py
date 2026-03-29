
from pathlib import Path

def readFileAndFolder():
    path=Path(__file__).parent
    # rglob recusively read and provide all items in each file of folder 
    items=list(path.glob('*'))
    for i,item in enumerate(items):
        print(f'{i+1} : {item}')

def createFile():
    try:
        readFileAndFolder()
        name=input("enter file name : ")
        p=Path(__file__).parent / name
        if not p.exists():
            with open(p,'w') as fs:
                data=input("enter data to write in file : ")
                fs.write(data)
                print("file created successfully") 
        else:
            print("file already exists")          
    except Exception as err:
        print(f"error : {err}")
    

def readFile():
    try:
        readFileAndFolder()
        name=input('enter file name to read :')
        p=Path(__file__).parent / name
        if p.exists() and p.is_file():
            with open(p,'r') as fs:
                data=fs.read()
                print(f"data in file is : {data}")
        else:
            print("file does not exist")
    except Exception as err:
        print(f"error : {err}")

def updateFile():
    try:
        readFileAndFolder()
        name = input("enter file name to update : ")
        p=Path(__file__).parent / name
        if p.exists() and p.is_file():
            while True:
                print("press 0 if you want to exit ")
                print("press 1 if you want to change the name of file ")
                print("press 2 if you want to overwrite the data in file ")
                print("press 3 if you want to append data in file")
                check=int(input("enter your choice : "))
                if check==0:
                    break   
                elif check==1:
                    newName=input("enter new name of file : ")
                    p.rename(newName)
                    print("file name updated successfully")
                elif check==2:
                    with open(p,'w') as fs:
                        data=input("enter data to write in file : ")
                        fs.write(data)
                        print("file updated successfully") 
                elif check==3:
                    with open(p,'a') as fs:
                        data=input("enter data to append in file : ")
                        fs.write(data)
                        print("data appended successfully") 
                else:
                    print("invalid choice")
            
        else:
            print("file does not exist")
    except Exception as err:
        print(f"error : {err}")


def deleteFile():
    try:
        readFileAndFolder()
        name = input("enter file name to delete : ")
        p=Path(__file__).parent / name
        if p.exists() and p.is_file():
            p.unlink()
            print("file deleted successfully")
        else:
            print("file does not exist")
    except Exception as err:
        print(f"error : {err}")                




while True:
    print("enter 0 to exit")
    print("enter 1 to create file")
    print("enter 2 to read file")
    print("enter 3 to update file")
    print("enter 4 to delete file")

    check=int(input("enter your choice : "))

    if check==0:
        break
    elif check==1:
        createFile()
    elif check==2:
        readFile()
    elif check==3:
        updateFile()
    elif check==4:  
        deleteFile()
    else:
        print("invalid choice")    