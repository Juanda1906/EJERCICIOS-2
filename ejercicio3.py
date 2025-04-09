Mes = int(input("ingresar el numero del mes (1-12):"))

match Mes:
    case 12 | 1 | 2:
        print ("La estacion de estos meses es invierno")
    case 3 | 4 | 5:
        print ("La estacion de estos meses es primavera")    
    case 6 | 7 | 8: 
        print ("La estacion de estos meses es verano")
    case 9 | 10 | 11: 
        print ("La estacion dee estos meses es otoño")
    case _:
        print ("Mes no valido")    
