[![Java CI with Maven](https://github.com/palyfight/SimpleRegexApi/actions/workflows/dev.yml/badge.svg)](https://github.com/palyfight/SimpleRegexApi/actions/workflows/dev.yml)
[![codecov](https://codecov.io/gh/palyfight/SimpleRegexApi/branch/master/graph/badge.svg)](https://codecov.io/gh/palyfight/SimpleRegexApi)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=palyfight_SimpleRegexApi&metric=alert_status)](https://sonarcloud.io/dashboard?id=palyfight_SimpleRegexApi)

# SimpleRegexApi
A very simple java api to handle a few common regex patterns.
Simply create a regex pattern object and use it to match against a String

## Usage
#### Prebuilt patterns
```java
PatternFactory pf = new PatternFactory();
RegexPattern rp = pf.getPattern(PatternType.ENUM);
rp.match(your_string);
```
- **[IPV4](https://raw.githubusercontent.com/palyfight/SimpleRegexApi/dev/src/main/java/patterns/impl/IPV4Pattern.java)**
- **[IPV6](https://raw.githubusercontent.com/palyfight/SimpleRegexApi/dev/src/main/java/patterns/impl/IPV6Pattern.java)**
- **[Email](https://raw.githubusercontent.com/palyfight/SimpleRegexApi/dev/src/main/java/patterns/impl/EmailPattern.java)**
- **[Phone](https://raw.githubusercontent.com/palyfight/SimpleRegexApi/dev/src/main/java/patterns/impl/PhonePattern.java)**

#### Custom pattern
```java
PatternFactory pf = new PatternFactory();
RegexPattern rp = pf.getPattern("valid_regex_pattern");
rp.match(your_string);
```

## Supported methods
- match() - returns a List<String> of all matches found
- matchFound() - returns True if at least 1 match was found
- countMatches() - returns a count of all matches found
