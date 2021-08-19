import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Bahubali 2",8,"RajaMouli"));
        movies.add(new Movie("RRR",9,"RajaMouli"));
        movies.add(new Movie("Bahubali",8,"RajaMouli"));
        movies.add(new Movie("KGF",9,"Prashanth"));
        movies.add(new Movie("Saaho",6,"Sujith"));
        movies.add(new Movie("Rangasthalam",9, "Sukumar"));
        System.out.println("-------------Filtering-----------");
        movies.stream().filter(movie -> movie.getRating()<7).forEach(System.out::println);
        System.out.println("-----------Mapping----------");
        movies.stream().map(movie -> movie.getMovieName()).forEach(System.out::println);
        System.out.println("--------collecting-------------");
        List<Movie> movieList=movies.stream().collect(Collectors.toList());
        System.out.println(movieList);
        System.out.println("--------Distinct----------");
        movies.stream().map(movie -> movie.getDirector()).distinct()
                .forEach(System.out::println);
        System.out.println("--------limit------");
        movies.stream().map(movie -> movie.getDirector()).distinct().limit(2)
                .forEach(System.out::println);
        System.out.println("------------skip------------------");
        movies.stream().map(movie -> movie.getMovieName()).skip(2).forEach(System.out::println);
        System.out.println("------------Find First-----------");
        Optional<Movie> movieOptional=movies.stream().filter(movie -> movie.getDirector().equals("RajaMouli")).findFirst();
        System.out.println(movieOptional);
        System.out.println("-----------Reducing------------");
        Optional<String> movieOptional1=movies.stream().map(movie -> movie.getMovieName()).reduce((a, b)-> a+","+b);
        System.out.println(movieOptional1);
        System.out.println("----------Group By--------------");
        movies.stream().collect(Collectors.groupingBy(Movie::getDirector)).forEach(((s, movies1) -> System.out.println(s+" Count "+movies1.size())));

    }

}
