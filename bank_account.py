class BankAccount:
    __account_number = 0
    __type = ''
    __owner_name = ""
    __owner_last_name = ""
    __amount = 0

    def __init__(self, account_number, tipo, owner_name, owner_last_name):
        self.__account_number = account_number
        self.__type = tipo
        self.__owner_name = owner_name
        self.__owner_last_name = owner_last_name

    def get_owner_name(self):
        return self.__owner_name

    def get_owner_last_name(self):
        return self.__owner_last_name

    def get_type(self):
        return self.__type

    def get_account_number(self):
        return self.__account_number

    def add(self, amount):
        if self.__type == 'A':
            self.__account_a('a', amount)
        elif self.__type == 'B':
            self.__account_b('a', amount)
        else:
            self.__account_c('a', amount)

    def withdraw(self, amount):
        if self.__type == 'A':
            self.__account_a('w', amount)
        elif self.__type == 'B':
            self.__account_b('w', amount)
        else:
            self.__account_c('w', amount)

    def __account_a(self, operation, amount):
        if operation == 'a':
            if self.__amount == 50000:
                print("No se puede ingresar más dinero a la cuenta. Límite de $50,000")
            else:
                if self.__amount + amount >= 50000:
                    spare = self.__amount + amount - 50000
                    self.__amount = 50000
                    print("Operación exitosa. Saldo actual:", self.__amount)
                    print("Límite excedido. Dinero regresado:", spare)
                else:
                    self.__amount += amount
                    print("Operación exitosa. Saldo actual:", self.__amount)
        else:
            if self.__amount >= 1000 and 1000 <= amount <= self.__amount:
                self.__amount -= amount
                print("Operación exitosa. Saldo actual:", self.__amount)
            else:
                print("Operación fallida. Saldo insuficiente.")

    def __account_b(self, operation, amount):
        if operation == 'a':
            if self.__amount == 100000:
                print("No se puede ingresar más dinero a la cuenta. Límite de $100,000")
            else:
                if self.__amount + amount >= 100000:
                    spare = self.__amount + amount - 100000
                    self.__amount = 100000
                    print("Operación exitosa. Saldo actual:", self.__amount)
                    print("Límite excedido. Dinero regresado:", spare)
                else:
                    self.__amount += amount
                    print("Operación exitosa. Saldo actual:", self.__amount)
        else:
            if self.__amount >= 5000 and 5000 <= amount <= self.__amount:
                self.__amount -= amount
                print("Operación exitosa. Saldo actual:", self.__amount)
            else:
                print("Operación fallida. Saldo insuficiente.")

    def __account_c(self, operation, amount):
        if operation == 'a':
            self.__amount += amount
            print("Operación exitosa. Saldo actual:", self.__amount)
        else:
            if self.__amount >= amount:
                self.__amount -= amount
                print("Operación exitosa. Saldo actual:", self.__amount)
