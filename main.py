from libro import Libro
from libreria import Libreria
from usuario import Usuario

libreria = Libreria()

while True:

    print("""
    \n
================================================
|| Seleccione una opción:                     ||
|| 1. Registrar usuario                       ||
|| 2. Registrar libro                         ||
|| 3. Rentar libro                            ||
|| 4. Listar usuarios registrados             ||
|| 5. Listar libros registrados               ||
|| 6. Listar usuarios con libros rentados     ||
|| 7. Listar libros rentados                  ||
|| 8. Listar libros que no han sido rentados  ||
|| 9. Cerrar programa                         ||
================================================
    """)

    opcion = input("Su elección: ")

    if opcion == "1":
        name = input("Nombre del usuario: ")
        last_name = input("Apellido del usuario: ")
        libreria.add_user(Usuario(name, last_name))
        print("Agregaste al usuario {} {}".format(name, last_name))

    elif opcion == "2":
        title = input("Título del libro: ")
        author = input("Autor del libro: ")
        libreria.add_book(Libro(title, author))
        print("Agregaste el libro {} de {}".format(title, author))

    elif opcion == "3":
        user_id = int(input("Ingrese el ID del usuario que rentará: "))
        book_id = int(input("Ingrese el ID del libro a rentar: "))
        libreria.rent(user_id, book_id)

    elif opcion == "4":
        print("================================================")
        libreria.list_users()
        print("================================================")

    elif opcion == "5":
        print("================================================")
        libreria.list_books()
        print("================================================")

    elif opcion == "6":
        print("================================================")
        libreria.list_users_with_books()
        print("================================================")

    elif opcion == "7":
        print("=================================================")
        libreria.rented_books()
        print("=================================================")

    elif opcion == "8":
        print("================================================")
        libreria.not_rented_books()
        print("================================================")

    elif opcion == "9":
        print("Cerrando programa...")
        break

    else:
        print("Seleccione una opción válida")
