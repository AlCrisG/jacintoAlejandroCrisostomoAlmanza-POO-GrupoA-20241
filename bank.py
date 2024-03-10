
class Bank:
    __accounts = []

    def __init__(self):
        self.__accounts = []

    def add_account(self, account):
        self.__accounts.append(account)

    def list_accounts(self):
        print("=== CUENTAS AGREGADAS ===")
        for account in self.__accounts:
            print("*******************************************")
            print("Propietario de la cuenta: {} {}".format(account.get_owner_name(), account.get_owner_last_name()))
            print("Número de cuenta: {}".format(account.get_account_number()))
            print("Tipo de cuenta: {}".format(account.get_type()))
            print("*******************************************\n")

    def show_user_account(self, owner_name, owner_last_name):
        encontrado = False
        for account in self.__accounts:
            if account.get_owner_name() == owner_name:
                encontrado = True
                print("*******************************************")
                print("Propietario de la cuenta: {} {}".format(account.get_owner_name(), account.get_owner_last_name()))
                print("Número de cuenta: {}".format(account.get_account_number()))
                print("Tipo de cuenta: {}".format(account.get_type()))
                print("*******************************************\n")
        if not encontrado:
            print("No se encontraron cuentas para el usuario {}. {}.".format(owner_name, owner_last_name))

    def show_account(self, account_number):
        encontrado = False
        for account in self.__accounts:
            if account.get_account_number() == account_number:
                encontrado = True
                print("*******************************************")
                print("Propietario de la cuenta: {} {}".format(account.get_owner_name(), account.get_owner_last_name()))
                print("Número de cuenta: {}".format(account.get_account_number()))
                print("Tipo de cuenta: {}".format(account.get_type()))
                print("*******************************************\n")
        if not encontrado:
            print("No se encontraron cuentas para el número {}.".format(account_number))
