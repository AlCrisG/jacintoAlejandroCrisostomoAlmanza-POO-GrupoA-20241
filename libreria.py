class Libreria:
    __users = []
    __books = []

    def add_user(self, user):
        self.__users.append(user)

    def add_book(self, book):
        self.__books.append(book)

    def rent(self, user_id, book_id):
        user_found = False
        for user in self.__users:
            if user.get_id() == user_id:
                user_found = True
                book_found = False
                for book in self.__books:
                    if book.get_id() == book_id:
                        book_found = True
                        if not book.is_rented():
                            book.set_rented(True)
                            user.rent_book(book)
                            print("Libro rentado con éxito.")
                        else:
                            print("Este libro ya está siendo rentado.")
                if not book_found:
                    print("Libro no encontrado.")
        if not user_found:
            print("Usuario no encontrado.")

    def list_users(self):
        print("============= USUARIOS REGISTRADOS =============")
        if len(self.__users) == 0:
            print("================================================")
            print("No hay ningún usuario registrado")
            print("================================================")
        else:
            for user in self.__users:
                print("================================================")
                print("ID del usuario: {}".format(user.get_id()))
                print("Nombre de usuario: {} {}".format(user.get_name(), user.get_last_name()))
                print("================================================")

    def list_books(self):
        print("============== LIBROS REGISTRADOS ==============")
        if len(self.__books) == 0:
            print("================================================")
            print("No hay ningún libro registrado")
            print("================================================")
        else:
            for book in self.__books:
                print("================================================")
                print("ID del libro: {}".format(book.get_id()))
                print("Título del libro: {}".format(book.get_title()))
                print("Autor del libro: {}".format(book.get_author()))
                print("================================================")

    def list_users_with_books(self):
        print("=========== USUARIOS RENTANDO LIBROS ===========")
        rentado = False
        for user in self.__users:
            if user.has_rented_books():
                rentado = True
                print("================================================")
                print("ID del usuario: {}".format(user.get_id()))
                print("Nombre del usuario: {} {}".format(user.get_name(), user.get_last_name()))
                print("Cantidad de libros rentados: {}".format(user.books_quantity()))
                print("================================================")
        if not rentado:
            print("================================================")
            print("Ningún usuario está rentando libros")
            print("================================================")

    def rented_books(self):
        print("================ LIBROS RENTADOS ================")
        rentado = False
        for book in self.__books:
            if book.is_rented:
                rentado = True
                print("=================================================")
                print("ID del libro: {}".format(book.get_id()))
                print("Título del libro: {}".format(book.get_title()))
                print("Autor del libro: {}".format(book.get_author()))
                print("=================================================")
        if not rentado:
            print("=================================================")
            print("Ningún libro ha sido rentado")
            print("=================================================")

    def not_rented_books(self):
        print("============== LIBROS NO RENTADOS ==============")
        rentado = True
        for book in self.__books:
            if not book.is_rented:
                rentado = False
                print("================================================")
                print("ID del libro: {}".format(book.get_id()))
                print("Título del libro: {}".format(book.get_title()))
                print("Autor del libro: {}".format(book.get_author()))
                print("================================================")
        if rentado:
            print("================================================")
            print("Todos los libros han sido rentados")
            print("================================================")
