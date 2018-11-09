# pw4j: Java Wrapper for Politics and War API
### Alex's APIs Covered:
* **Unauthenticated APIs:**
    - Nation and Nations API
    - Alliances and Alliances API
    - War and Wars API
    - Tradeprice API
    - City API
    - Applicants API
* **Authenticated APIs:** *(Require `apiKey`)*
    - Tradehistory API
    - Alliance Bank and Members API

### Features
- Simple design to handle API requests.
- Easy object models that encapsulate JSON handling.
- Proper Exceptions are thrown on Connectivity failures or API Query failures.
- Don't need to worry about Alex's stupid API.

## Usage

To start using the wrapper, build a `PoliticsAndWar` object using `PoliitcsAndWarBuilder`. If you want to access Alliance Members API and Alliance Bank API, 
you'll have to provide 
the 
`apiKey`. But `apiKey` is optional.
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWarBuilder().build();
```
or 
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWarBuilder().setApiKey("YOUR_API_KEY_STRING").build();
```

To use the Test server API,
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWarBuilder().setTestServerMode(true).build();
```
or 
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWarBuilder().setApiKey("YOUR_API_KEY_STRING").setTestServerMode(true).build();
```

That was the hardest part. :sweat_smile:

Now you can get a Nation with
```java
politicsAndWar.getNation(6); //Where 6 is Nation Id
```
or Alliance Bank (if you entred `apiKey`)
```java
politicsAndWar.getBank(913); //Where 913 is Alliance ID
```

>Note: The wrapper DOES NOT store your `apiKey` in anyway. Well it's open source, have a look at the code if you doubt it.

### Missing Features
- Caching of queries to improve performance

## Errors and Issues or Suggestions
Make an issue [here](https://github.com/Adorable-SkullMaster/pw4j/issues) if you are facing errors, problems, unintended behaviour, need help or to drop a suggestion.

## Contributing
Read [CONTRIBUTING.md](CONTRIBUTING.md)

Author: [Adorable-SkullMaster](https://github.com/Adorable-SkullMaster)
