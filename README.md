# 📘 Bootcamp Java - Guia de Referência

Projeto educacional cobrindo os principais conceitos de Java 17, organizado em 15 módulos progressivos.

## ⚙️ Tecnologias

- **Java 17**
- **Maven**
- **Lombok 1.18.34**
- **JUnit 4.13.2**

## 🚀 Como Executar

```bash
# Compilar o projeto
mvn clean compile

# Executar os testes
mvn test

# Executar uma classe específica
mvn exec:java -Dexec.mainClass="bootcamp.doc.um.classe.abstrata.TesteClasseAbstrata"
```

---

## 📂 Estrutura dos Módulos

| # | Módulo | Pacote | Conceito |
|---|--------|--------|----------|
| 1 | Classes Abstratas e Anônimas | `um.classe` | Herança, polimorfismo, classes anônimas, lambda |
| 2 | Interfaces | `dois.interfaces` | Contratos, interface funcional, @FunctionalInterface |
| 3 | Modificadores de Acesso | `tres.modificador_acesso` | private, public, static, final |
| 4 | Lombok | `quatro.lombok` | @Getter, @Setter, @AllArgsConstructor |
| 5 | Data/Hora (LocalDate) | `cinco.localdate` | LocalDate, LocalDateTime, Instant, Duration |
| 6 | Optional | `seis.optional` | Optional.ofNullable, isPresent |
| 7 | Equals vs == | `sete.equals_igualigual` | Comparação de referência vs conteúdo |
| 8 | Collections | `oito.collection` | List, Set, Map, Iterator, Comparator |
| 9 | Streams | `nove.stream` | Stream API, filter, map, forEach, average |
| 10 | Filter em Map | `dez.filter` | Stream + filter em entrySet de Map |
| 11 | Lambdas | `onze.lambdas` | Expressões lambda, Thread, forEach, IntFunction |
| 12 | Switch | `doze.funcswitch` | Switch tradicional vs Switch Expression (Java 14+) |
| 13 | Sobrescrita e Sobrecarga | `treze.sobrescrita_sobrecarga` | @Override, Overload |
| 14 | Tratamento de Exceções | `quartoze.tratamento_exececoes` | try-catch-finally, exceção customizada |
| 15 | Testes Automáticos | `quinze.testes_automaticos` | JUnit 4, @Test, assertEquals |
| 16 | Records | `dezesseis.record` | Record, imutabilidade, construtor compacto |

---

## 📖 Detalhamento dos Módulos

### 1. Classes Abstratas e Anônimas (`um.classe`)

#### Classe Abstrata (`um.classe.abstrata`)
- **Conta.java** — Classe abstrata com método `imprimeExtrato()` que subclasses DEVEM implementar
- **ContaCorrente.java** — Implementação concreta para Conta Corrente
- **ContaPoupanca.java** — Implementação concreta para Conta Poupança
- **TesteClasseAbstrata.java** — Demonstra polimorfismo: variável do tipo abstrato, instância concreta

```java
// Polimorfismo: tipo Conta (abstrata), instância ContaPoupanca (concreta)
Conta poupanca = new ContaPoupanca();
```

#### Classe Anônima (`um.classe.anonima`)
- **Conta.java** — Classe base com método que será sobrescrito inline
- **InterfaceConta.java** — Interface funcional (1 método abstrato)
- **CarteiraContas.java** — Cria subclasses sem nome (classes anônimas)
- **CarteiraContasInterface.java** — Lambda substituindo classe anônima

```java
// Classe anônima: cria subclasse inline
Conta contaCorrente = new Conta() {
    @Override
    public void imprimeTipoConta() {
        System.out.println("Conta Corrente");
    }
};

// Lambda: forma simplificada (só funciona com interface funcional)
InterfaceConta conta = () -> System.out.println("Conta Corrente");
```

---

### 2. Interfaces (`dois.interfaces`)

- **Conta.java** — Interface define contrato: depositar, sacar, getSaldo
- **ContaCorrente.java** — Implementa com taxa de operação
- **ContaPoupanca.java** — Implementa sem taxa
- **Extrato.java** — Aceita interface como parâmetro (polimorfismo)
- **TesteInterface.java** — Teste prático

#### Interface Funcional (`dois.interfaces.funcional`)
- **ContaInterfaceFuncional.java** — @FunctionalInterface com 1 método
- **TesteInterfaceFuncional.java** — Implementação via lambda

```java
@FunctionalInterface
public interface ContaInterfaceFuncional {
    void exibeSaldo(Double valor); // Único método abstrato
}

// Uso com lambda
ContaInterfaceFuncional conta = valor -> System.out.println("Saldo: " + valor);
```

---

### 3. Modificadores de Acesso (`tres.modificador_acesso`)

| Modificador | Escopo |
|-------------|--------|
| `private` | Somente na própria classe |
| `default` | Mesmo pacote |
| `protected` | Mesmo pacote + subclasses |
| `public` | Qualquer lugar |

- **Conta.java** — Encapsulamento: atributo private + getters/setters
- **ContaCorrente.java** — `final` em atributos (constantes)
- **StaticConta.java** — `final class` (não pode ser herdada) + `static` method
- **TesteStatic.java** — Chamada estática: `Classe.metodo()` sem instanciar
- **TesteFinal.java** — `final` em referência: conteúdo muda, referência não

```java
// final em referência: não pode reatribuir, mas pode alterar conteúdo
final Conta conta = new Conta(900.00);
conta.setSaldo(800.00); // OK! Altera conteúdo
// conta = new Conta(500.00); // ERRO! Não pode mudar a referência
```

---

### 4. Lombok (`quatro.lombok`)

Elimina código boilerplate com anotações:

| Anotação | Gera automaticamente |
|----------|---------------------|
| `@Getter` | Métodos get para todos os atributos |
| `@Setter` | Métodos set para todos os atributos |
| `@AllArgsConstructor` | Construtor com todos os parâmetros |
| `@Data` | @Getter + @Setter + @ToString + @EqualsAndHashCode |

---

### 5. Data e Hora (`cinco.localdate`)

| Classe | Uso |
|--------|-----|
| `LocalDate` | Apenas data (sem hora) |
| `LocalDateTime` | Data + hora |
| `Instant` | Timestamp (ponto no tempo) |
| `Duration` | Diferença entre dois instantes |
| `DateTimeFormatter` | Formatação customizada |

```java
LocalDate hoje = LocalDate.now();
DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println(hoje.format(fmt)); // 25/05/2026
```

---

### 6. Optional (`seis.optional`)

Evita `NullPointerException`:

```java
Conta conta = null;
Optional<Conta> opt = Optional.ofNullable(conta);
opt.isPresent();      // false
opt.orElse(new Conta(0.0)); // retorna valor padrão se null
```

---

### 7. Equals vs == (`sete.equals_igualigual`)

| Operador | Compara | Exemplo |
|----------|---------|---------|
| `==` | Referências (endereço de memória) | `"abc" == "abc"` → true (String Pool) |
| `.equals()` | Conteúdo (valor) | `new String("abc").equals("abc")` → true |

**Regra:** Sempre use `.equals()` para comparar Strings e objetos.

---

### 8. Collections (`oito.collection`)

#### Hierarquia:
```
Collection
├── List (permite duplicatas, mantém ordem)
│   └── ArrayList
├── Set (sem duplicatas)
│   └── HashSet
└── Map (chave-valor)
    ├── HashMap
    └── TreeMap (ordenado)
```

| Subpacote | Conceito |
|-----------|----------|
| `iterator/` | Padrão Iterator para percorrer coleções |
| `list/` | ArrayList, Collections.sort, Comparator |
| `set/` | HashSet, Comparable, equals |
| `map/` | HashMap, TreeMap, Comparator customizado |

---

### 9. Streams (`nove.stream`)

Pipeline de operações funcionais sobre coleções:

```java
// Cadeia: filter → mapToDouble → average
Double media = contas.stream()
    .filter(c -> c.getTipoConta().equals("Conta Comum"))
    .mapToDouble(c -> c.getSaldo())
    .average()
    .getAsDouble();
```

| Tipo | Operações |
|------|-----------|
| **Intermediárias** (lazy) | filter, map, mapToDouble, sorted |
| **Terminais** (executam) | forEach, collect, average, count |

---

### 10. Filter em Map (`dez.filter`)

```java
// Filtra entries de um Map usando Stream
mapa.entrySet().stream()
    .filter(entry -> entry.getKey() <= 2)
    .forEach(entry -> System.out.println(entry));
```

---

### 11. Lambdas (`onze.lambdas`)

Evolução de classe anônima → lambda:

```java
// 1. Classe anônima (verbosa)
Runnable r = new Runnable() { public void run() { ... } };

// 2. Lambda com variável
Runnable r = () -> System.out.println("Lambda");

// 3. Lambda inline (máxima concisão)
new Thread(() -> System.out.println("Inline")).start();
```

| Sintaxe Lambda | Quando usar |
|----------------|-------------|
| `() -> expr` | Sem parâmetros |
| `x -> expr` | 1 parâmetro |
| `(x, y) -> expr` | Múltiplos parâmetros |
| `x -> { stmts; }` | Múltiplas linhas |

---

### 12. Switch Expression (`doze.funcswitch`)

| Versão | Sintaxe |
|--------|---------|
| Tradicional | `case X: ...; break;` |
| Java 14+ (Expression) | `case X -> valor;` |
| Múltiplos valores | `case X, Y -> valor;` |

```java
// Switch Expression: retorna valor, sem break necessário
String msg = switch (tipo) {
    case "Corrente" -> "É corrente";
    case "Poupanca", "Comum" -> "É poupança/comum";
    default -> "Desconhecido";
};
```

---

### 13. Sobrescrita e Sobrecarga (`treze.sobrescrita_sobrecarga`)

| Conceito | Definição | Exemplo |
|----------|-----------|---------|
| **Sobrescrita** (Override) | Mesmo método, implementação diferente na subclasse | `depositar(Double)` |
| **Sobrecarga** (Overload) | Mesmo nome, parâmetros diferentes | `sacar(Double)` e `sacar(Double, Double)` |

---

### 14. Tratamento de Exceções (`quartoze.tratamento_exececoes`)

```java
try {
    conta.sacar(0.00);              // Código que pode falhar
} catch (ExcecaoCustomizada e) {
    System.out.println(e.getMessage()); // Trata erro específico
} catch (Exception e) {
    System.out.println(e.getMessage()); // Trata erro genérico
} finally {
    System.out.println("Sempre executa"); // Limpeza de recursos
}
```

| Palavra-chave | Função |
|---------------|--------|
| `try` | Bloco que pode lançar exceção |
| `catch` | Captura e trata a exceção |
| `finally` | Sempre executa (limpeza) |
| `throw` | Lança exceção |
| `throws` | Declara que método pode lançar exceção |

---

### 15. Testes Automáticos (`quinze.testes_automaticos`)

Testes unitários com JUnit 4 seguindo padrão AAA:

```java
@Test
public void testaSaque() {
    // Arrange (Preparar)
    Conta conta = new Conta(100.00, 0.50);

    // Act (Executar)
    conta.sacar(50.00);

    // Assert (Verificar)
    assertEquals(49.50, conta.getSaldo());
}
```

| Anotação/Método | Função |
|-----------------|--------|
| `@Test` | Marca método como teste |
| `assertEquals(esperado, atual)` | Verifica igualdade |
| `assertTrue(condição)` | Verifica se é true |
| `assertNotNull(obj)` | Verifica se não é null |

---

### 16. Records (`dezesseis.record`)

Records (Java 16+) são classes imutáveis e concisas que geram automaticamente construtor, acessores, `equals()`, `hashCode()` e `toString()`.

#### Arquivos:
| Arquivo | Conceito |
|---------|----------|
| `ContaRecord.java` | Definição de record com construtor compacto (validação) |
| `ContaTradicional.java` | Classe equivalente para comparação (50+ linhas vs 5) |
| `TesteRecordBasico.java` | Uso básico: acessores sem "get", toString automático |
| `TesteRecordEquals.java` | equals/hashCode gerados automaticamente |
| `TesteRecordImutabilidade.java` | Imutabilidade: sem setters, cria novo para "alterar" |
| `TesteRecordComCollections.java` | Records com Stream, filter, groupingBy |
| `TesteRecordComInterface.java` | Records implementando interfaces |
| `TesteRecordComSwitch.java` | Records + Switch Expression |
| `TesteRecordValidacao.java` | Construtor compacto para validação fail-fast |

#### Comparação: Record vs Classe vs Lombok

```java
// RECORD (5 linhas) — Java 16+
public record ContaRecord(String tipoConta, Double saldo, Double taxaOperacao) { }

// LOMBOK (5 linhas) — depende de biblioteca externa
@Getter @AllArgsConstructor @EqualsAndHashCode @ToString
public class ContaLombok {
    private final String tipoConta;
    private final Double saldo;
    private final Double taxaOperacao;
}

// CLASSE TRADICIONAL (50+ linhas)
public class ContaTradicional {
    private final String tipoConta;
    private final Double saldo;
    private final Double taxaOperacao;
    // + construtor + getters + equals + hashCode + toString
}
```

#### O que Record PODE e NÃO PODE:

| Pode ✅ | Não pode ❌ |
|---------|------------|
| Implementar interfaces | Estender classes (já estende Record) |
| Ter métodos customizados | Ter atributos adicionais de instância |
| Ter métodos estáticos | Ter setters (é imutável) |
| Construtor compacto (validação) | Ser abstrato |
| Ser usado em Collections/Streams | Ser modificado após criação |

```java
// Record com validação no construtor compacto
public record ContaRecord(String tipoConta, Double saldo, Double taxaOperacao) {
    public ContaRecord {
        if (saldo < 0) throw new IllegalArgumentException("Saldo inválido");
    }
}

// Acessores: sem prefixo "get"
conta.saldo()       // em vez de conta.getSaldo()
conta.tipoConta()   // em vez de conta.getTipoConta()

// Imutabilidade: para "alterar", cria novo record
ContaRecord nova = new ContaRecord(conta.tipoConta(), conta.saldo() + 500, conta.taxaOperacao());
```

---

## 📋 Resumo Rápido

```
Classe Abstrata → não instancia, obriga implementar métodos
Interface       → contrato puro, múltipla implementação
Lambda          → função anônima para interfaces funcionais
Stream          → pipeline funcional sobre coleções
Optional        → evita NullPointerException
Collections     → List (duplicatas OK), Set (únicos), Map (chave-valor)
Switch Expr     → case -> valor (Java 14+, sem break)
Override        → mesmo método, comportamento diferente (subclasse)
Overload        → mesmo nome, parâmetros diferentes
try-catch       → tratamento de exceções
JUnit           → testes automatizados (@Test + assert)
Record          → classe imutável concisa (Java 16+), sem setters, gera equals/hashCode/toString
```
