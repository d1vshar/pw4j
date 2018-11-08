# pw4j: Politics and War API Java Wrapper
### Alex's APIs Covered:
- Nation and Nations API
- Alliances and Alliances API
- War and Wars API
- Tradeprice API
- City API
- Applicants API
- Alliance Bank and Members API (`apiKey` needs to be provided by your program)

### Features
- Simple design to handle API requests.
- Easy object models that encapsulate JSON handling.
- Proper Exceptions are thrown on Connectivity failures or API Query failures.
- Don't need to worry about Alex's stupid API.

## Usage

To start using the wrapper, instantiate a `PoliticsAndWar` object. If you want to access Alliance Members API and Alliance Bank API, you'll have to provide the `apiKey`. But `apiKey` is optional.
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWarBuilder().build();
```
or 
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWar().setApiKey("YOUR_API_KEY_STRING").build();
```

To use the Test server API,
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWarBuilder().setTestServerMode(true).build();
```
or 
```java
PoliticsAndWar politicsAndWar = new PoliticsAndWar().setApiKey("YOUR_API_KEY_STRING").setTestServerMode(true).build();
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
- Alliance ids in War API
- Trade-history API

## Errors and Issues or Suggestions
Make an issue [here](https://github.com/Adorable-SkullMaster/pw4j/issues) if you are facing errors, problems, unintended behaviour, need help or to drop a suggestion.

## Contributing
Please don't contribute in master branch. PR should be sent to dev branch only. Any PRs directly to master branch will be rejected.
Clone the repo, make changes in dev branch, start a PR. I'll review the changes and merge it accordingly. I'll be more than happy if you want to improve this wrapper :-)

Author: [Adorable-SkullMaster](https://github.com/Adorable-SkullMaster)