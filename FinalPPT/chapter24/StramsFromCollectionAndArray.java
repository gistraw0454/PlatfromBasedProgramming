List<String> list1 = Arrays.asList("dsad","dwas","dwadsadwa");
list1.stream().forEach(System.out::print);

String[] strings = {"morre","dwadas","dawdsa","Dwads"};
Stream<String> stream1 =Arrays.stream(strings);
stream1.forEach(System.out::print);

Stream<String> stream2 = Stream.of("morre","dwadas","dawdsa","Dwads");
stream2.forEach(System.out::print);

int[] numbers = {1,23,434,5};
IntStream number1 =Arrays.stream(numbers);
number1.forEach(System.out::print);

// 1234
IntStream.range(1,5).forEach(System.out::print);

// 12345
IntStream.rangeClosed(1,5).forEach(System.out::print);

// 0 2 4 6 8 10 ... -> 0 2 4 6 8 -> 각각 print
Stream.iterate(0,n->n+2).limit(5).forEach(System.out::print);

// 11111
Stream.generate(()->1).limit(5).forEach(System.out::print);


