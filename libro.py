import random


class Libro:
    __id = 0
    __title = ""
    __author = ""
    __rented = False

    def __init__(self, name, author):
        self.__id = random.randint(1, 1000)
        self.__title = name
        self.__author = author

    def get_title(self):
        return self.__title

    def get_author(self):
        return self.__author

    def get_id(self):
        return self.__id

    def is_rented(self):
        return self.__rented

    def set_rented(self, rented):
        self.__rented = rented
