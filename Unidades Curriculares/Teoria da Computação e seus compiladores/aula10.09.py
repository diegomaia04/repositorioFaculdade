KgRacao = float(input('Digite quantos kilos de ração ficará para a semana: '))

print('\n')

g1 = int(input('Coloque, em gramas, a quantide de ração consumida pelo g1: '))
g2 = int(input('Coloque, em gramas, a quantide de ração consumida pelo g2: '))

print('\n')


qntSemanal  = ((g1 + g2) * 5) / 1000

resto = KgRacao - qntSemanal

print(f' De {KgRacao}KG sobram apenas {resto}KG')
