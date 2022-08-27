# STREAM.API NOTES

# **Stream Api nedir?**

Hepimiz bir şekilde veri setleri ile işlemler yapıyoruz. En basitinden küçükten büyüğe veya büyükten küçüğe sıralamak bir veri seti işlemi. Veri setleri deyince aklımıza ilk gelen veri yapıları Listeler veya Diziler olabilir. Java 8 ile birlikte gelen Stream Api desteği, veriler üzerinde yapacağımız işlemleri temiz ve anlaşılır bir şekilde ifade edebilmemize olanak sağlıyor. stream() metodlarını kullanarak aslında yaptığımız işlem verilen data yapısının tamamını dolaşıp metodun isteğine uyanları gerçekleştirmek. 

Örnek verecek olursak

```java
List<Integer> datas = Arrays.asList(1,2,3,4,5);
```

şeklinde bir list oluşturalım. stream() in türkçe karşılığı “akış” anlamına gelir yani verileri dolaşır ve metodun istediği duruma göre işlemleri gerçekleştirir. Gerçekleştirilen işlemler datas üzerinde değişikliğe sebep olmaz , değişiklikleri görmek için yeni bir list oluşturup = kullanarak gözlemleyebiliriz.

 

```java
datas.stream().map((s)->s*s); // datas daki tüm elemanlar dolaşıldı ve map() içeri
//sindeki lambda expresiiondaki kendisiyle çarpma tüm elemanlar için gerçekleştirildi

//YENI ELEMANLARI GORMEK ICIN 
List<Integer> newDatas = datas.stream().map((s)->s*s).collect(Collectors.toList());
//collect(Collectors.toList()) sayesinde stream yapısındaki yeni elemanlar list e çevrilir

//YENI DATA LARI BASTIRMAK ICIN stream().forEach(...) kullanabiliriz.
newDatas.stream().forEach(System.out::println);
//System.out::println -> System.out içerisindeki println metoduna method reference gerçekleştirir
```

```java
public void fourthExample(){
	    List<Integer> datas = Arrays.asList(1,2,3,4,5);
	
	    List<Integer> newDatas = datas.stream().map((s)->s*s).collect(Collectors.toList());
	
	    System.out.println("NEW DATA");
	    newDatas.stream().forEach(System.out::println);
	
	    System.out.println("OLD DATA");
	    datas.stream().forEach(System.out::println);
	}
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3fb1afcd-5976-4b0d-b5a2-702545d249db/Untitled.png)

Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.The features of Java stream are –

- A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
- Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
- Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

Different Operations On Streams-

⚠️Stream yapıları kullanılırken öncelikle intermediate operations kullanılır bunlar sayesinde yaptırmak istediğimiz işlemleri gerçekleştiririz. Sonrasında terminal operations kullanılarak stream yapısının nasıl sonlanacağı belirtilmiş olur (collect dediğimizde intermediate operation sonuçlarını toplar ve soldaki data ya atar veya forEach(System.out::println) dediğimizde intermediate operation sonuçlarını bastırır)

**Intermediate Operations:**

1. **map:** The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
    
    (ELIMIZDEKI DATA YA BIR ISLEM GERCEKLESTIRMEYI VE SONUCU TOLIST() ILE BASKA BIR LIST E SAKLAMAYI SAGLAR. map(…) ICERSINDE FUNCTION INTERFACE I BULUNUR YANI LAMBDA EXPRESSION KULLANIRIZ)
    
    ```java
    List number = Arrays.asList(2,3,4,5);
    List square = number.stream().map(x->x*x).collect(Collectors.toList());
    ```
    
2. **filter:** The filter method is used to select elements as per the Predicate passed as argument.
    
    ```java
    List names = Arrays.asList("Reflection","Collection","Stream");
    List result =names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
    ```
    
3. **sorted:** The sorted method is used to sort the stream.
    
    ```java
    List names = Arrays.asList("Reflection","Collection","Stream");
    List result = names.stream().sorted().collect(Collectors.toList());
    ```
    

**Terminal Operations:**

1. **collect:** The collect method is used to return the result of the intermediate operations performed on the stream.
    
    ```java
    List number = Arrays.asList(2,3,4,5,3);
    Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
    ```
    
2. **forEach:** The forEach method is used to iterate through every element of the stream.
    
    ```java
    List number = Arrays.asList(2,3,4,5);
    number.stream().map(x->x*x).forEach(y->System.out.println(y));
    ```
    
3. **reduce:** The reduce method is used to reduce the elements of a stream to a single value.The reduce method takes a BinaryOperator as a parameter.
    
    ```java
    List number = Arrays.asList(2,3,4,5);
    int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
    ```
    

### ⭐EXAMPLE

```java
public void exampleWithStream(){
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "I26","I17","I29",
                "O71");
        someBingoNumbers.stream()
                .filter((number)-> number.toUpperCase().startsWith("G"))
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);

    }
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/865d899c-566b-484e-9c3d-651b8a47f860/Untitled.png)

⭐Belirli bir tipte birden fazla eleman içeren stream oluşturabiliriz fakat birden fazla tipte elemanlar içeren stream oluşturamayız

```java
public void exampleOfStream(){
        Stream<String> stream = Stream.of("I26","I17","I29","O71");
        Stream<Integer> secondStream = Stream.of(1,2,3,4,5);
    }
```

### ⚠️MORE ON INTERMEDIATE OPERATIONS

**distinct() → allows us to delete duplicate elements from data set.**

```java
//EXAMPLE OF USAGE distinct() intermediate operation
    public void exampleOfdistinct(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> anotherNumbers = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        //FIRSTLY I WILL CONCATENATE LISTS
        numbers.addAll(anotherNumbers);
        System.out.println("--------CONCATENATION RESULTS--------");
        numbers.forEach(System.out::println);

        //USING distinct() method
        numbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("--------DISTINCT USAGE RESULTS--------");
        numbers.forEach(System.out::println);

        
    }
```

**peek() →** allows us to see which element is processing on stream(). We can make this with forEach() but it is a terminal operation that stream has to end so that We can use peek() to see elements or can do other things on stream and it won’t be end

```java
//EXAMPLE OF USAGE peek() intermediate operation
    public void exampleOfpeek(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> anotherNumbers = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        //I WILL CONCATENATE LISTS AND USING PEEK STREAM WON'T FINISH
        numbers.addAll(anotherNumbers);
        System.out.println("PRINTING OUT WITH USING PEEK");
        List<Integer> concatenatedLists = numbers.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("PRINTING OUT WITH USING FOREACH");
        concatenatedLists.forEach(System.out::println);
    }
```

**flatMap() →** In short, we can say that if there is a **Stream of List of <<Data Type>>** before flattening, then on applying flatMap(), **Stream of <<Data Type>>** is returned after flattening.(İki boyutlu dizideki tüm elemanları yeni bir tek boyutlu diziye aktarma gibi düşünülebilir)

( [1,2,3,4,5] , [6,7,8,9,10] → ([1,2,3,4,5,6,7,8,9,10]))

**flatMap() V/s [map()](https://www.geeksforgeeks.org/stream-map-java-examples/) :**

1)**[map()](https://www.geeksforgeeks.org/stream-map-java-examples/):** takes a Stream and transform it to another Stream. It applies a function on each element of Stream and store return value into new Stream. It does not flatten the stream. But flatMap() is the combination of a map and a flat operation i.e, it applies a function to elements as well as flatten them.

2)**[map()](https://www.geeksforgeeks.org/stream-map-java-examples/):** is used for transformation only, but flatMap() is used for both transformation and flattening.

### **How does flatMap() work ?**

As already discussed in the post that flatMap() is the combination of a map and a flat operation i.e, it first applies map function and than flattens the result. Let us consider some examples to understand what exactly flattening a stream is.**Example 1 :**The list before flattening :

```
[ [2, 3, 5], [7, 11, 13], [17, 19, 23] ]

```

The list has 2 levels and consists of 3 small lists. After Flattening, it gets transformed into “one level” structure as shown :

```
[ 2, 3, 5, 7, 11, 13, 17, 19, 23 ]

```

**Example 2 :**The list before flattening :

```
[ ["G", "E", "E"], ["K", "S", "F"], ["O", "R", "G"], ["E", "E", "K", "S"] ]

```

The list has 3 levels and consists of 4 small lists. After Flattening, it gets transformed into “one level” structure as shown :

```
["G", "E", "E", "K", "S", "F", "O", "R", "G", "E", "E", "K", "S"]

```

In short, we can say that if there is a **Stream of List of <<Data Type>>** before flattening, then on applying flatMap(), **Stream of <<Data Type>>** is returned after flattening.

```java
//ANOTHER EXAMPLE OF flatMap()
    public void anotherExampleofFlatMap(){
        List<Character> myName = new ArrayList<>(Arrays.asList('M','A','H','M','U','T'));
        List<Character> mySurname = new ArrayList<>(Arrays.asList('C','E','L','I','K'));

        List<List> myFullName = new ArrayList<>();
        myFullName.add(myName);myFullName.add(mySurname);

        //BEFORE USING FLATMAP
        System.out.println("-------BEFORE USING FLATMAP -------\n"+myFullName);

        //USING FLATMAP
        System.out.println("-------USING FLATMAP -------");
        myFullName.stream()
                .flatMap((inList) -> inList.stream()).
                forEach(System.out::print);
    }
```

# **The Key Concepts: Identity, Accumulator and Combiner**

Before we look deeper into using the *Stream.reduce()* operation, let's break down the operation's participant elements into separate blocks. That way, we'll understand more easily the role that each one plays.

- *Identity* – an element that is the initial value of the reduction operation and the default result if the stream is empty
- *Accumulator* – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
- *Combiner* – a function used to combine the partial result of the reduction operation when the reduction is parallelized or when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation

**reduce() →** 

**Syntax :**

```
T reduce(T identity, BinaryOperator<T> accumulator);

Where,identity is initial value
of typeT andaccumulator is a
function for combining two values.

```

sum(), min(), max(), count() etc. are some examples of reduce operations. reduce() explicitly asks you to specify how to reduce the data that made it through the stream.

```java
import java.util.*;

class GFG {

	// Driver code
	public static void main(String[] args)
	{

		// Creating list of integers
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

		// Finding sum of all elements
		int sum = array.stream().reduce(0,
				(element1, element2) -> element1 + element2);

		// Displaying sum of all elements
		System.out.println("The sum of all elements is " + sum);
	}
}
```

---

Output :

```
The sum of all elements is 16
```

MORE ON REDUCE → [https://www.geeksforgeeks.org/stream-reduce-java-examples/](https://www.geeksforgeeks.org/stream-reduce-java-examples/)

	
	
# EXAMPLE OF USAGE STREAM API METHODS

package com.mahmutcelik;
import java.util.*;
import java.lang.String;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mainClass {
    public static void main(String[] args) {
        new mainClass().reduceExample();
    }

    //stream().map(...) EXAMPLE USAGE WITH INTEGER
    public void firstExample(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaresOfNumbers = numbers.stream().map((a) -> a + a).toList();

        squaresOfNumbers.forEach(System.out::println); //THIS PART USES METHOD REFERENCING
    }

    //stream().map(...) EXAMPLE USAGE WITH STRING
    public void secondExample(){
        List<String> names = Arrays.asList("MAHMUT","TIM","ELA");
        List<String> addNewLineSymbol = names.stream().map((a)-> new StringBuilder(a).append("\n").toString()).toList();

        addNewLineSymbol.forEach(System.out::print);
    }

    //stream().filter(...) EXAMPLE USAGE WITH INTEGER
    public void thirdExample(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,5);
        List<Integer> choosenNumbers = numbers.stream().filter((a)->a.equals(5)).collect(Collectors.toList());

        choosenNumbers.forEach(System.out::println);
    }

    //stream().filter(...) EXAMPLE USAGE WITH STRING
    public void fourthExample(){
        List<String> names = Arrays.asList("MAHMUT","TIM","ELA");
        List<String> filteredNames = names.stream().filter((name) -> name.equals("MAHMUT")).toList();
        filteredNames.stream().forEach(System.out::println);
    }

    //WHILE WE USE STREAM MAIN DATA WON'T CHANGE. THIS IS EXAMPLE OF THAT MAINTAIN.
    public void fifthExample(){
        List<Integer> datas = Arrays.asList(1,2,3,4,5);

        List<Integer> newDatas = datas.stream().map((s)->s*s).toList();

        System.out.println("NEW DATA");
        newDatas.stream().forEach(System.out::println);

        System.out.println("OLD DATA");
        datas.stream().forEach(System.out::println);
    }

    //EXAMPLE OF COMPARING IMPERATIVE (OLD FASHION) AND DECLARATIVE CODES
    public void comparingExampleIMPERATIVE(){
        List<String> names = new ArrayList<>(Arrays.asList("AAA","BBB","CCC","DDD","EEE"));
        String newNameToAdd = "FFF";
        boolean canAdd = false;

        for(String aName: names){
            if(aName.equals(newNameToAdd)){
                canAdd = false;
                break;
            }
            canAdd = true;
        }

        if(canAdd) {
            names.add(newNameToAdd);
        }
        for(String name: names) System.out.println(name);
    }

    public void comparingExampleDECLARATIVE(){
        List<String> names = new ArrayList<>(Arrays.asList("AAA","BBB","CCC","DDD","EEE"));

        boolean doesHave = names.stream().anyMatch((name) -> name.equalsIgnoreCase("FFF"));
        if(!doesHave) names.add("FFF");
        names.forEach(System.out::println);
    }

    //BELOW EXAMPLE THERE ARE NUMBERS WITH LETTERS AND I HAVE USED SOME LAMBDA EXPRESSIONS TO MAKE DIFFERENT THINGS
    //BELOW OF THIS METHOD WILL MAKE KIND THINGS LIKE THIS
    public void exampleWithoutStream(){
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "I26","I17","I29",
                "O71");

        someBingoNumbers.forEach(System.out::println);
        List<String> gNumbers = new ArrayList<>();
        //gNumbers arraylist must be effectively-final because I will add new Strings in lambda expression
        //to arraylist. If arraylist won't be effectively-final it will cause an error

        someBingoNumbers.forEach((first)->
        {
            if(first.toUpperCase().startsWith("G")) gNumbers.add(first);
        });

        System.out.println("NUMBERS THAT BEGIN WITH G/g");
        gNumbers.forEach(System.out::println);

        System.out.println("NUMBERS THAT BEGIN WITH G/g AND SORTED");
        gNumbers.sort(String::compareToIgnoreCase); //firstString.comparteToIgnoreCase(secondString) yerine method reference kullanıldı
        gNumbers.forEach(System.out::println);

    }

    public void exampleWithStream(){
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "I26","I17","I29",
                "O71");
        someBingoNumbers.stream()
                .filter((number)-> number.toUpperCase().startsWith("G"))
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);

    }

    //Belirli bir tipte birden fazla eleman içeren stream oluşturabiliriz
    // fakat birden fazla tipte elemanlar içeren stream oluşturamayız
    public void exampleOfStream(){
        Stream<String> stream = Stream.of("I26","I17","I29","O71");
        Stream<String> secondStream = Stream.of("AA","BB","CC");

        //WE CAN CONCATENATE STREAMS
        Stream<String> concatenatesStream = Stream.concat(stream,secondStream);
    }

    //EXAMPLE OF USAGE distinct() intermediate operation
    public void exampleOfdistinct(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> anotherNumbers = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        //FIRSTLY I WILL CONCATENATE LISTS
        numbers.addAll(anotherNumbers);
        System.out.println("--------CONCATENATION RESULTS--------");
        numbers.forEach(System.out::println);

        //USING distinct() method
        numbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("--------DISTINCT USAGE RESULTS--------");
        numbers.forEach(System.out::println);
    }

    //EXAMPLE OF USAGE peek() intermediate operation
    public void exampleOfpeek(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> anotherNumbers = new ArrayList<>(Arrays.asList(3,4,5,6,7));

        //I WILL CONCATENATE LISTS AND USING PEEK STREAM WON'T FINISH
        numbers.addAll(anotherNumbers);
        System.out.println("PRINTING OUT WITH USING PEEK");
        List<Integer> concatenatedLists = numbers.stream().peek(System.out::println).collect(Collectors.toList());
        System.out.println("PRINTING OUT WITH USING FOREACH");
        concatenatedLists.forEach(System.out::println);
    }

    //EXAMPLE OF USAGE flatmap() intermediate operation
    public void exampleOfflatmap(){
        Employee john = new Employee("John Doe",30);
        Employee jane = new Employee("Jane Deer",25);
        Employee jack = new Employee("Jack Hill",40);
        Employee snow = new Employee("Snow White",22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr); departments.add(accounting);
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);
    }

    //ANOTHER EXAMPLE OF flatMap()
    public void anotherExampleofFlatMap(){
        List<Character> myName = new ArrayList<>(Arrays.asList('M','A','H','M','U','T'));
        List<Character> mySurname = new ArrayList<>(Arrays.asList('C','E','L','I','K'));

        List<List> myFullName = new ArrayList<>();
        myFullName.add(myName);myFullName.add(mySurname);

        //BEFORE USING FLATMAP
        System.out.println("-------BEFORE USING FLATMAP -------\n"+myFullName);

        //USING FLATMAP
        System.out.println("-------USING FLATMAP -------");
        myFullName.stream()
                .flatMap((inList) -> inList.stream()).
                forEach(System.out::print);

    }

    //COLLECTORS DIFFERENT SYNTAX
    public void collectors(){
        List<String> someBingoNumbers = Arrays.asList(
                "N40","N36",
                "B12","B6",
                "G53","G49","G60","G50","g64",
                "I26","I17","I29",
                "O71");
        List<String> sortedNumbers = someBingoNumbers.stream()
                .map(String::toUpperCase)
                .filter(s-> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        sortedNumbers.forEach(System.out::println);
    }

    //reduce() example
    public void reduceExample(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.stream().reduce((integer, integer2) -> integer<integer2 ? integer: integer2);
        numbers.forEach(System.out::println);
    }
}

