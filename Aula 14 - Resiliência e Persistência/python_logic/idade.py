try:
    idade = int(input("Digite sua idade: "))
    print(f"Idade registrada: {idade}")

except ValueError:
    print("Erro de operação: Por favor insira apenas caracteres numéricos. (e.: 20)")