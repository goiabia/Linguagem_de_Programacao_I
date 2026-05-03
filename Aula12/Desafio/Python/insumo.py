class Insumo:
    # Passo 1: A Estrutura do Insumo (Nível Introdutório)
    def __init__(self, nome, quantidade, mes_validade):
        self.__nome        = nome
        self.__quantidade  = quantidade
        # Já passa pelo filtro de sanidade no construtor
        self.__mes_validade = None
        self.set_mes_validade(mes_validade)

    # Passo 2: O Filtro de Sanidade (Nível Intermediário)
    def set_mes_validade(self, mes):
        if 1 <= mes <= 12:
            self.__mes_validade = mes
        else:
            print(f"ERRO: Mês '{mes}' inválido para '{self.__nome}'. "
                  f"Informe um valor entre 1 e 12. Valor original mantido.")

    def get_mes_validade(self):
        return self.__mes_validade

    def get_nome(self):
        return self.__nome

    # Passo 3: A Trava de Segurança Final (Nível Avançado)
    def esta_valido(self, mes_atual):
        if self.__mes_validade is None:
            print("ALERTA: Validade não definida. Produto suspeito!")
            return False
        if self.__mes_validade < mes_atual:
            print(f"ALERTA: Risco de Amendoim Murcho! "
                  f"'{self.__nome}' está VENCIDO (validade: mês {self.__mes_validade}, "
                  f"mês atual: {mes_atual}).")
            return False
        return True


# Testes 
MES_ATUAL = 5 

# Insumo válido
amendoim_fresco = Insumo("Amendoim Torrado", 20, 8)
print(f"{amendoim_fresco.get_nome()} está válido? "
      f"{amendoim_fresco.esta_valido(MES_ATUAL)}")         

# Insumo vencido
amendoim_murcho = Insumo("Amendoim Granulado", 5, 3)
print(f"{amendoim_murcho.get_nome()} está válido? "
      f"{amendoim_murcho.esta_valido(MES_ATUAL)}")          

# Tentativa de mês inválido
amendoim_errado = Insumo("Amendoim Salgado", 10, 13)        
print(f"Validade mantida: {amendoim_errado.get_mes_validade()}")  
