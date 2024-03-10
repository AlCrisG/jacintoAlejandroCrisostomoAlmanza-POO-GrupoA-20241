from bank import Bank
from employee import Employee

if __name__ == "__main__":
    banco = Bank()

    empleado1 = Employee("Jose", "Chavez", 165732489, 'C')
    empleado1.add_account(123456789, 'A')
    empleado1.add_account(987654321, 'B')
    banco.add_account(empleado1.accounts[0])
    banco.add_account(empleado1.accounts[1])
    banco.add_account(empleado1.accounts[2])

    empleado2 = Employee("Juan", "Perez", 843612798, 'B')
    empleado2.add_account(456789123, 'C')
    banco.add_account(empleado2.accounts[3])
    banco.add_account(empleado2.accounts[4])

    while True:
        print("""\nSeleccione una opción:
1. Listar todos los usuarios con su información
2. Mostrar información de una cuenta en específico
3. Mostrar todas las cuentas de un usuario
4. Salir
""")

        opcion = int(input("Su elección: "))

        if opcion == 1:
            print("=== Todos los usuarios con su información ===")
            banco.list_accounts()
        elif opcion == 2:
            numero_cuenta = int(input("Ingrese el número de cuenta: "))
            banco.show_account(numero_cuenta)
        elif opcion == 3:
            nombre_usuario = input("Ingrese el nombre del usuario: ")
            apellido_usuario = input("Ingrese el apellido del usuario: ")
            banco.show_user_account(nombre_usuario, apellido_usuario)
        elif opcion == 4:
            print("Cerrando programa...")
            break
        else:
            print("Ingrese una opción válida")
