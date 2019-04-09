# pw4j: Java Wrapper for Politics and War API
### Alex's APIs Covered:
- Nation and Nations API
- Alliances and Alliances API
- War and Wars API
- Tradeprice and Tradehistory API
- City and All-Cities API
- Applicants and Members API
- Alliance Bank API
- Nation-Military API

### Scrape Clients (All are allowed withing game rules and widely used among the alliances)
- Bank Withdrawal Client : You can withdraw money from Bank to Nation/another Alliance
    
### Features
- Simple design to handle API requests.
- In-built cache system for faster requests.
- Easy object models that encapsulate JSON handling.
- Proper Exceptions are thrown on Connectivity failures or API Query failures.
- Don't need to worry about Alex's stupid API.

## Usage

Please have a look at the [wiki](https://github.com/Adorable-SkullMaster/pw4j/wiki).

### Missing but planned Features

- War-Attacks API is missing. I am planning to support it in near future but delaying due to stupid JSON structure of the endpoint.
- Messaging Client to send Messages.
- Nation Transaction Client for getting transactions of a Nation.
- Alliance Client for merging the existing `AllianceWithdrawBankClient` along with tax changes client, tax Records client, member and applicants role change 
client.

## Errors and Issues or Suggestions
Make an issue [here](https://github.com/Adorable-SkullMaster/pw4j/issues) if you are facing errors, problems, unintended behaviour, need help or to drop a suggestion.

## Contributing
Read [CONTRIBUTING.md](CONTRIBUTING.md)

Author: [Adorable-SkullMaster](https://github.com/Adorable-SkullMaster)
