# Loja-de-Seguros

Desenvolvimento de um sistema de vendas para uma loja de Seguros de Carros. Este é um esboço do sistema,  sem interface gráfica, possui somente suas classes básicas.

### Classes, atributos e considerações:

- Classe Seguro = é uma interface que possui 3 métodos, um método para retornar o nome da empresa do seguro, outro para retornar o valor e por fim um para retornar o número do seguro.

- Classe abstrata Paciente = implementa a interface Seguro, mas não implementa seus métodos por ser uma classe abstrata. Ele possui variáveis privadas nome, anoNascimento, método construtor, get e toString para apresentação.

- Classe Assegurado = herda de Paciente, possuindo variáveis referente a interface Seguro, implementação de seus métodos e método toString. O cálculo do valor do seguro leva em consideração a idade do paciente multiplicado por 150.

- Classe NãoAssegurado = herda de Paciente, possui a variável cartaoCredito, métodos construtor, get e toString. Os métodos relacionados a interface Seguro devem retornar os valores “NDA” para Empresa, 0 para Valor e “000-0000” para
número do seguro.

- Classe Carro implementa a interface Seguro, tendo as variáveis cor, preco, modelo e ano, com seus respectivos métodos get, método construtor e toString. O cálculo do valor do seguro leva em consideração o preço e idade do veículo, sendo calculado da seguinte forma: (Preco * 0.02) + (150 – idade) * 0.025. A idade deve ser calculada considerando o ano atual.

- Classe SeguroTeste = para testar os objetos, onde deve
ser criado um vetor do tipo Seguro de tamanho 3 com objeto do tipo Assegurado, NaoAssegurado e Carro, apresentando suas informações e custo do seguro.