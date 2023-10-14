# Anotações Importantes

## Sumário

- [Anotações Importantes](#anotações-importantes)
  - [Sumário](#sumário)
  - [Dependências / Bibliotecas](#dependências--bibliotecas)
    - [Project Lombok](#project-lombok)
    - [O que é H2 Database Engine?](#o-que-é-h2-database-engine)
    - [bcrypt](#bcrypt)
  - [Conceitos](#conceitos)
    - [O que é Java?](#o-que-é-java)
    - [O que é Maven?](#o-que-é-maven)
    - [O que é SpringBoot?](#o-que-é-springboot)

## Dependências / Bibliotecas

### Project Lombok

O Project Lombok é uma biblioteca Java que visa simplificar o desenvolvimento de código reduzindo a quantidade de código "boilerplate" (código repetitivo e de baixo valor) que os desenvolvedores precisam escrever. Ela fornece anotações que podem ser adicionadas ao código-fonte Java para gerar automaticamente métodos comuns, como getters, setters, construtores, hashCode e equals, entre outros.

A ideia por trás do Project Lombok é melhorar a legibilidade do código, reduzir a probabilidade de erros e aumentar a produtividade dos desenvolvedores, removendo a necessidade de escrever código repetitivo e tedioso. Em vez de escrever manualmente todos os métodos getter e setter para cada campo de classe, por exemplo, você pode simplesmente adicionar uma anotação `@Getter` ou `@Setter` ao campo e o Lombok gerará automaticamente esses métodos durante a compilação.

O Project Lombok também oferece suporte para muitas outras funcionalidades, como criação automática de construtores, métodos `toString()`, métodos `equals()` e `hashCode()`, e muito mais. Isso pode tornar o código Java mais conciso e mais fácil de manter.

É importante notar que, para utilizar o Project Lombok em um projeto, é necessário configurar seu ambiente de desenvolvimento para reconhecer as anotações e processá-las durante a compilação. Geralmente, isso envolve a instalação de um plugin ou uma extensão específica para a sua IDE (Ambiente de Desenvolvimento Integrado) e a inclusão da biblioteca Lombok no seu projeto.

Em resumo, o Project Lombok é uma biblioteca Java que ajuda os desenvolvedores a reduzir a verbosidade do código Java, automatizando a geração de métodos comuns por meio de anotações, tornando o código mais limpo e mais eficiente.

### O que é H2 Database Engine?

O H2 Database Engine é um sistema de gerenciamento de banco de dados relacional (RDBMS) escrito em Java. Ele é um banco de dados de código aberto que é conhecido por ser leve, rápido e de fácil uso. O H2 é frequentemente usado como um banco de dados incorporado em aplicativos Java, o que significa que pode ser incorporado diretamente em um aplicativo sem a necessidade de uma instalação separada de servidor de banco de dados.

Algumas características e pontos importantes sobre o H2 Database Engine incluem:

1. **Velocidade:** O H2 é conhecido por sua rapidez e eficiência, o que o torna uma escolha popular para aplicativos que requerem alto desempenho.

2. **Portabilidade:** Como é escrito em Java, o H2 é portátil e pode ser executado em várias plataformas, incluindo Windows, Linux e macOS.

3. **Modos de operação:** Ele suporta vários modos de operação, incluindo o modo de banco de dados incorporado, modo de servidor TCP/IP e modo de banco de dados de memória.

4. **Compatibilidade SQL:** O H2 oferece suporte a grande parte da linguagem SQL padrão e é compatível com muitos recursos do SQL-92 e SQL-99.

5. **Recursos avançados:** Apesar de ser leve, o H2 oferece suporte a recursos avançados, como índices, chaves estrangeiras, gatilhos, procedimentos armazenados e muito mais.

6. **Confiabilidade:** Embora seja frequentemente usado para desenvolvimento e testes, o H2 também pode ser usado em ambientes de produção, desde que configurado e gerenciado corretamente.

7. **Ferramentas de administração:** O H2 inclui ferramentas de administração web e uma interface de linha de comando para ajudar os administradores a gerenciar bancos de dados H2.

8. **Suporte a transações:** Ele suporta transações ACID (Atomicidade, Consistência, Isolamento e Durabilidade) para garantir a integridade dos dados.

Devido à sua simplicidade e desempenho, o H2 é muitas vezes escolhido por desenvolvedores para desenvolver e testar aplicativos Java, bem como para cenários onde um banco de dados leve e rápido é necessário.

### bcrypt

A biblioteca bcrypt em Java é uma ferramenta valiosa para lidar com o armazenamento seguro de senhas em aplicativos. O bcrypt é um algoritmo de hash de senhas projetado para ser lento e resistente a ataques de força bruta, o que o torna uma escolha sólida para proteger senhas de forma eficaz. Abaixo estão alguns pontos importantes a serem considerados sobre a biblioteca bcrypt em Java:

1. Segurança: O bcrypt é uma escolha sólida para o armazenamento seguro de senhas, porque é deliberadamente lento e utiliza uma "sal" aleatória para cada senha, o que torna muito difícil para um atacante descobrir as senhas originais através de ataques de força bruta ou dicionário.

2. Facilidade de Uso: A biblioteca bcrypt em Java facilita a integração do bcrypt em seus aplicativos. Existem várias bibliotecas de terceiros, como a "jBCrypt", que fornecem uma interface simples e eficaz para trabalhar com bcrypt em Java.

3. Resistência a Ataques: O bcrypt é projetado para ser resistente a ataques de força bruta. Ele é ajustável em termos de custo computacional, o que significa que você pode configurar o nível de dificuldade do algoritmo de acordo com suas necessidades de segurança. Isso pode ser útil para aumentar a segurança ao longo do tempo, conforme as capacidades de computação aumentam.

4. Geração de "Sal": Bcrypt gera automaticamente um valor de "sal" aleatório para cada senha, o que adiciona uma camada adicional de segurança. Isso significa que duas senhas idênticas serão armazenadas de maneira diferente devido aos valores de sal únicos.

5. Comparação de Senhas: Bcrypt em Java também fornece métodos para comparar senhas de forma segura. Isso permite que você verifique as senhas dos usuários durante o processo de autenticação sem expor a senha real.

6. Recomendação: Bcrypt é amplamente recomendado pela comunidade de segurança e é uma escolha confiável para armazenar senhas de maneira segura. É importante não criar seu próprio algoritmo de hash de senhas, pois isso pode levar a vulnerabilidades de segurança.

Em resumo, a biblioteca bcrypt em Java é uma opção robusta e segura para proteger senhas em aplicativos. Certifique-se de integrar corretamente o bcrypt em seu código, escolher um custo computacional apropriado e manter-se atualizado com as melhores práticas de segurança para garantir que as senhas dos usuários sejam tratadas de maneira segura.

## Conceitos

### O que é Java?

Java é uma linguagem de programação de alto nível e uma plataforma de desenvolvimento de software. Foi criada pela Sun Microsystems (agora parte da Oracle Corporation) na década de 1990 e desde então se tornou uma das linguagens de programação mais populares do mundo devido à sua portabilidade, versatilidade e ampla adoção em uma variedade de domínios, desde desenvolvimento web até aplicativos móveis e sistemas de back-end.

Aqui estão algumas características importantes do Java:

1. Portabilidade: O Java é projetado para ser altamente portável, o que significa que os programas escritos em Java podem ser executados em diferentes sistemas operacionais sem a necessidade de modificação. Isso é possível devido à máquina virtual Java (JVM - Java Virtual Machine), que traduz o código Java em um formato intermediário que pode ser executado em diferentes plataformas.

2. Orientação a objetos: Java é uma linguagem de programação orientada a objetos, o que significa que ela se baseia em conceitos como classes, objetos e herança. Isso promove a reutilização de código e torna o desenvolvimento de software mais modular e fácil de manter.

3. Segurança: Java tem uma forte ênfase na segurança. A JVM executa programas Java em um ambiente isolado, o que ajuda a prevenir a execução de código malicioso. Além disso, a linguagem possui recursos de gerenciamento de memória que ajudam a evitar problemas comuns de segurança, como vazamentos de memória.

4. Multithreading: Java oferece suporte nativo para programação concorrente e multithreading, permitindo que os desenvolvedores criem aplicativos que podem executar várias tarefas simultaneamente.

5. Bibliotecas ricas: A plataforma Java inclui uma vasta biblioteca padrão (Java Standard Library) que fornece funcionalidades prontas para uso, tornando o desenvolvimento mais eficiente.

Java é amplamente utilizado no desenvolvimento de aplicativos empresariais, aplicativos Android, sistemas embarcados, aplicativos de servidor, aplicativos de desktop e muito mais. Além disso, a linguagem continua a evoluir com novas versões e recursos, mantendo-se relevante no mundo da programação.

### O que é Maven?

Maven é uma ferramenta de gerenciamento de construção de projetos amplamente usada no desenvolvimento de software Java e em outras linguagens de programação. Ela ajuda os desenvolvedores a automatizar o processo de construção, compilação, empacotamento e distribuição de projetos. O Maven é especialmente popular na comunidade Java e é uma parte fundamental do ecossistema de desenvolvimento Java.

Aqui estão algumas das principais funcionalidades e conceitos associados ao Maven:

1. **Gerenciamento de Dependências:** O Maven facilita a gestão das dependências do projeto. Ele permite que você declare as bibliotecas e componentes necessários para o seu projeto em um arquivo de configuração chamado "POM" (Project Object Model). O Maven então resolve automaticamente essas dependências, baixa as bibliotecas necessárias da internet e as incorpora em seu projeto.

2. **Padrão de Diretório:** O Maven segue um padrão de diretório bem definido, o que significa que os projetos Maven têm uma estrutura de diretório consistente. Isso facilita a organização de código-fonte, recursos e testes em um projeto.

3. **Ciclo de Vida de Build:** O Maven define um ciclo de vida de build com fases predefinidas, como compilação, teste, empacotamento e distribuição. Você pode executar essas fases por meio de comandos Maven, tornando o processo de construção do projeto previsível e reprodutível.

4. **Plugins:** O Maven é altamente extensível por meio de plugins. Existem muitos plugins disponíveis para realizar tarefas específicas, como a compilação de código, a execução de testes, a geração de documentação, entre outras.

5. **Repositórios:** O Maven usa repositórios para armazenar bibliotecas e plugins. O repositório central do Maven é uma grande coleção de bibliotecas Java mantidas pela comunidade. Além disso, você pode configurar repositórios personalizados para armazenar suas próprias bibliotecas internas ou de terceiros.

6. **Convenções sobre Configuração:** O Maven enfatiza convenções sobre configuração, o que significa que muitas configurações são predefinidas e você só precisa especificar as configurações que diferem do padrão.

Para começar a usar o Maven, você normalmente cria um arquivo POM para seu projeto e adiciona as dependências e configurações necessárias. Em seguida, você pode usar comandos Maven, como "mvn compile," "mvn test," "mvn package," etc., para construir e gerenciar seu projeto.

Em resumo, o Maven é uma ferramenta essencial para simplificar o gerenciamento de projetos e dependências no desenvolvimento de software Java, tornando o processo de construção e distribuição mais consistente e controlado.

### O que é SpringBoot?

O Spring Boot é um projeto dentro do ecossistema Spring Framework que simplifica o desenvolvimento de aplicativos Java, especialmente aplicativos baseados em Spring, tornando o processo mais rápido e fácil. Ele fornece uma abordagem de "opinião" para o desenvolvimento, o que significa que ele define configurações padrão sensíveis e escolhas de design que podem ser personalizadas, mas que funcionam bem para a maioria dos casos de uso. O Spring Boot é amplamente utilizado no desenvolvimento de aplicativos Java para web, microservices e outros tipos de aplicativos empresariais.

Aqui estão algumas características e conceitos-chave associados ao Spring Boot:

1. **Configuração Automática (Auto-Configuration):** O Spring Boot inclui um mecanismo de configuração automática que tenta detectar automaticamente as bibliotecas e componentes que você está usando em seu projeto e configura-os adequadamente. Isso reduz a necessidade de configuração manual e permite que você comece rapidamente com seu desenvolvimento.

2. **Starter POMs:** O Spring Boot fornece "starter POMs" (Project Object Models) que incluem dependências pré-configuradas para cenários comuns, como desenvolvimento web, acesso a banco de dados, segurança, entre outros. Isso facilita a adição de funcionalidades ao seu projeto com apenas algumas linhas de configuração.

3. **Embedded Web Server:** O Spring Boot inclui servidores web incorporados, como o Tomcat, Jetty ou Undertow. Isso significa que você pode criar aplicativos web autônomos que não requerem implantação em um servidor externo.

4. **Microservices:** O Spring Boot é frequentemente usado no desenvolvimento de microservices devido à sua facilidade de configuração e desenvolvimento rápido. Ele se integra bem com outras tecnologias do ecossistema Spring, como Spring Cloud, para lidar com desafios comuns de microservices, como descoberta de serviços, balanceamento de carga, configuração distribuída e muito mais.

5. **Spring Boot CLI:** Além de usar o Spring Boot em projetos Maven ou Gradle, você também pode usar a CLI (Command Line Interface) do Spring Boot para criar e gerenciar aplicativos de forma mais rápida e eficiente a partir da linha de comando.

6. **Comunidade Ativa:** O Spring Boot possui uma comunidade ativa de desenvolvedores e é bem documentado, tornando mais fácil encontrar recursos, tutoriais e suporte online.

Em resumo, o Spring Boot é uma ferramenta poderosa para simplificar o desenvolvimento de aplicativos Java, permitindo que os desenvolvedores se concentrem mais na lógica de negócios do que na configuração e na infraestrutura. Ele é amplamente adotado na comunidade de desenvolvimento Java, especialmente em projetos empresariais e de microservices.
