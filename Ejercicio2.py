num1 = float(input("ingresar primer numero:"))
num2 = float(input("ingresar segundo numero:"))
operacion = (input("ingresar operacion (+,-,*,/)"))
calculadora = (num1, num2, operacion)
match operacion:
        case '+':
            print("Resultado:", num1 + num2)
        case '-': 
            print ("Resultado", num1 - num2)
        case '*': 
          print ("Resultado", num1 * num2)
        case '/':
          if num2 == 0: 
              print ("No valido, division entre cero")
          else:
              print ("Resultado", num1 / num2)
        case _:
              print ("operacion no valida")
 