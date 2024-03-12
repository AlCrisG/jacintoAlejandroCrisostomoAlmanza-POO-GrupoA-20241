import random


class Usuario:
    __id = 0
    __name = ""
    __last_name = ""
    __rented_books = []

    def __init__(self, name, last_name):
        self.__id = random.randint(1, 1000)
        self.__name = name
        self.__last_name = last_name

    def rent_book(self, book):
        self.__rented_books.append(book)

    def has_rented_books(self):
        if self.__rented_books:
            return True
        else:
            return False

    def books_quantity(self):
        return len(self.__rented_books)

    def get_name(self):
        return self.__name

    def get_last_name(self):
        return self.__last_name

    def get_id(self):
        return self.__id
