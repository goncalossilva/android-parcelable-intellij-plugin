# Change Log

##Version 0.7

* Improve parcelable-related declaration order
* Remove unecessary "this." prefixes (Android projects follow Hungarian notation)
* Remove default constructor creation (out of scope)

##Version 0.6

* CREATOR is now final - proguard will not touch it now
* fixed parcelable class loader

##Version 0.2

* added nullable primitives support
* added primitive array support
* added boolean sparse array support
* added list list serialization

##Version 0.1

* working primitive type serialization
* initial release - proof of concept
