# DavesList
## Rooms for rent. One admin w/pwd. Bootstrap.

To make it easier for students that live far away to participate in the academy, Dave has decided to create a website to list all the people that he knows that have rooms for rent available. This site is password protected because only Dave should be able to add or update a listing. Using Spring Security to provide the login functionality. It doesn't need a database for the security because only 1 person will be logging in, so hardwire the login to be username: DaveWolf, password: beastmaster.

The rooms should show up as a list with the address, city, state, and price on the list. When the user clicks on the link for an item, it goes to another screen and shows the detail of the individual listing: description, rules, wifi (yes/no), cable (none/basic/premium) and private bathroom (yes/no).

Finally, every listing should have an isRented field that is used to show whether the listing is already taken or not. Rooms that have been rented out aren't deleted, they are marked as isRented. When Dave logs in, he can add a listing or change a listing to be rented or not. He does not delete listings. Only dave should be able to add or update a listing.

Use Twitter Bootstrap to design your application.

This application should only need one table.
