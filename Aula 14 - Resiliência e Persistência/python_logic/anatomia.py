# O código fatal
with open("estoque_dener.txt", "r") as arquivo:
    print(arquivo.read())

print("--- Auditoria de Estoque ---")

try:
    # Zona de Risco: Tentativa de leitura ('r')
    with open("estoque_dener.txt", "r") as arquivo:
        dados = arquivo.read()
        print("Estoque carregado com sucesso:")
        print(dados)

except FileNotFoundError:
    # Lógica de Fallback (Plano B)
    print("[ALERTA] Base de dados não encontrada.")
    print("[SISTEMA] Inicializando um novo arquivo de estoque zerado...")

    # Abrimos no modo 'w' (Write) ou 'a' (Append) para forçar a criação física do arquivo
    with open("estoque_dener.txt", "w") as arquivo:
        arquivo.write("--- REGISTRO DE ESTOQUE DA SORVETERIA ---\n")

    print("[SISTEMA] Novo arquivo criado. O inventário está vazio.")