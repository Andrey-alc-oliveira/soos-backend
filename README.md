# 🛠️ SOOS - Service Order Management System

O **SOOS** é um sistema profissional de gestão de ordens de serviço para oficinas mecânicas, desenvolvido com **Java 21** e **Spring Boot 3**. O projeto foi estruturado aplicando boas práticas de arquitetura de software, Clean Code, conformidade com a **LGPD** e modelagem avançada com **JPA/Hibernate**.

---

## 🚀 Tecnologias e Ferramentas

- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **Lombok**
- **Banco de Dados:** H2 Database (Desenvolvimento) / PostgreSQL
- **IDE:** Spring Tools 4 (STS4)
- **Gerenciador de Dependências:** Maven

---

## 📐 Decisões de Arquitetura e Modelagem

- **Herança Polimórfica (`JOINED`):** 
  Modelagem da hierarquia de veículos (`Veiculo`, `Carro`, `Onibus`, `Caminhao`) com a estratégia de junção do JPA (`InheritanceType.JOINED`) para evitar tabelas esparsas e colunas nulas desnecessárias no banco de dados.

- **Proteção de Dados e LGPD:**
  Exclusão explícita de campos sensíveis (como CPF/CNPJ) do método `toString()` via `@ToString.Exclude`, evitando vazamento de dados de identificação pessoal (PII) nos logs do sistema.

- **Integridade das Entidades JPA:**
  - Desabilitação de setters para IDs (`@Setter(AccessLevel.NONE)`) para garantir que a chave primária seja gerenciada unicamente pela base de dados.
  - Construtores protegidos (`@NoArgsConstructor(access = AccessLevel.PROTECTED)`) para atender aos requisitos do JPA sem expor instanciações inválidas na regra de negócio.
  - Campos de documento mantidos como `String` para preservar zeros à esquerda.
  - Enums mapeados explicitamente como `EnumType.STRING` para segurança na persistência.

- **Prevenção de Recursão e Lazy Loading:**
  Uso de `@ToString.Exclude` e `@EqualsAndHashCode.Exclude` em relacionamentos `@ManyToOne` (como `Cliente` em `Veiculo`) para evitar estouro de pilha (`StackOverflowError`) e consultas indesejadas no Hibernate.

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/soos-backend.git](https://github.com/SEU-USUARIO/soos-backend.git)
Acesse a pasta do projeto:

Bash
cd soos-backend
Execute a aplicação via Maven:

Bash
./mvnw spring-boot:run
📌 Status do Desenvolvimento
[x] Modelagem do Domínio de Clientes (Cliente, TipoPessoa)

[x] Mapeamento Base de Veículos (Veiculo, TipoVeiculo) com JOINED

[ ] Implementação das Subclasses de Veículos (Carro, Onibus, Caminhao)

[ ] Domínio de Mecânicos e Ordens de Serviço

[ ] Camada de Serviço e Validações de Negócio

[ ] Endpoints RESTful