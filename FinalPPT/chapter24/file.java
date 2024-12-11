try (Steam<String> lines = FIles.lines(Path.get("data.txt",Charset.defaultCharset()))){
    lines.ForEach(System.out::println);
}
catch(IOException e){
    System.out.println(e);
}