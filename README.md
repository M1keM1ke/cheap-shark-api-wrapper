![java 11 image](https://img.shields.io/badge/java-11-red)
![retrofit2 image](https://img.shields.io/badge/dependencies-retrofit2-green)
#Wrapper for CheapShark API

##Documentation
Official documentation https://apidocs.cheapshark.com

##Quick start
- Follow instruction for adding dependency  
[https://jitpack.io/#M1keM1ke/cheap-shark-api-wrapper](https://jitpack.io/#M1keM1ke/cheap-shark-api-wrapper)

- Add example below  
`CheapShark cheapShark = new CheapShark();
   Response<List<ListOfGamesDto>> listOfGamesResponse = cheapShark  
   .gamesClient()  
   .listOfGames(toQueryMap(
     ListOfGamesRequestDto.builder()
     .setTitle("batman")
     .setLimit("10")
     .build())
   ).execute();`