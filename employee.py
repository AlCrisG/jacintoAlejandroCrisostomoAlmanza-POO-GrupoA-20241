from bank_account import BankAccount


class Employee:
    __name = ""
    __last_name = ""
    accounts = []
    tipo = ""

    def __init__(self, name, last_name, account_number, tipo):
        self.__name = name
        self.__last_name = last_name
        self.add_account(account_number, tipo)

    def add_account(self, account_number, tipo):
        if tipo == 'A' or tipo == 'B' or tipo == 'C':
            self.accounts.append(BankAccount(account_number, tipo, self.__name, self.__last_name))
            print("Dado de alta con éxito.")

        else:
            print("Tipo de cuenta inválido.")

    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_last_name(self):
        return self.__last_name

    def set_last_name(self, last_name):
        self.__last_name = last_name

    def get_accounts(self):
        return self.accounts
