
# Aula de 02/10/2023
Uma breve descrição sobre o que esse projeto faz e para quem ele é

* escalamento
  
  - gestão de recursos (tempo)
  - CPU / IO'sobre
  - Tipos: timing sharing ( divisão tempo)

* preepção : é a capacidade do sistema operacional interroper preocessos

* processos: qualquer coisa em execução

#### Ciclo de vida de um processos

* estado novo: Coletando requissitos do sistema operacional para executar  uma função, so mexe com recursos, so se precupoda em coletar recursos

* estado pronto: o sfotware coletou todos requisitos para executar a função, mas ainda não executou a fução executada, recursos

* estado espera: o programa é colocado em espera, e aguarda outros processamentos para seguir, que depende da CPU, recurso

* estad ode execução: o processo esta em andamento, recursos e CPU

* estado encerrado: o  prograam ternimou sua execução e libero recursos para outro processamento, liberou tudo os recursos

#### O Que São Os Sistemas Operacionais Multitarefa?
Quando um sistema operacional permite a execução de mais de um programa ao mesmo tempo, ele é chamado de multitarefa e tem de lidar com procedimentos que concorrem quanto à utilização da capacidade de processamento do hardware.

#### O que são sistemas Monoprogramaveis?

Os sistemas monoprogramáveis, como vieram a ser conhecidos, se caracterizam por permitir que o processador, a memória e os periféricos permaneçam exclusivamente dedicados à execução de um único programa. Os sistemas monoprogramáveis estão tipicamente relacionados ao surgimento dos mainframes.

----

FIFO: 
* o primeiro processo que entra é o primeiro a ser executado, entra no escalamento do sistema operacional

* não preenptivo ( o sistema operacional nao intervem)

Aplicação A: 10 unidades de tempo

Aplicação B: 10 unidades de tempo

Aplicação C: 5 unidades de tempo

Aplicação D: 1 unidade de tempo

ordens de relização: a, b, c, d.

### dois tipos de escalamentos!

* escalamento RR (circular)

 - Linux, o sistema operacional tem poderes,é capaz de fechar processos quando necessario

 - janela de tempo: cada janela de tempo executa um processo por vez, se não executou vai para o final da final, em cada janela a cpu se dediqua 100%

 - Windows; Colaborativo, cada processo decide pela execução, cada sfotware decide pela prorpia execução, sistema flexivel