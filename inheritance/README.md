# Lab 6 - Inheritance

## Summary
This program allows a user to create restaurant object, and a unique
review associated with a restaurant. 

## Operation

- ran entirely from the Library.java file
- create a new Restaurant 
- create a new Review
- add Review to a Restaurant using `restaurant.addReview(review)`
- print list of reviews using `sout(restaurant.reviewList)`
- Average rating of a restaurant is calculated and updated 
when adding a review

**Tests**
- constructors
- `./gradlew test` in the terminal

# Lab 7 - Inheritanc Pt. II

## Summary
Program now allows the creation of "Shops" & "Theaters". The ability
to review shops, theaters and specific movies was added as well.

## Operation
- same as Lab 6 with additional features:
- create a Shop
- create a Theatre
- add movies currently showing at a theater with `addMovie(String)`
- remove movies from currently showing with `removeMovie(String)`
- can review a specific movie by using the `MovieReview` class

