# Código problemático (SEM with — NÃO use assim)
arquivo = open("vendas.txt", "a")
arquivo.write("Venda: Pote Chocolate\n")
conteudo = arquivo.read()
# Se houver um erro aqui, o arquivo NUNCA será fechado!
arquivo.close()

print(conteudo)

try:
    with open("vendas.txt", "a") as banco_dados:
        banco_dados.write("Venda: Pote Chocolate\n")
        print("Dados persistidos com sucesso.")
        conteudo = banco_dados.read()
except IOError:
    print("Erro crítico: Não foi possível acessar o disco.")
finally:
    print("[SISTEMA] Rotina de I/O finalizada. Recursos liberados.")