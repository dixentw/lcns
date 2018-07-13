if [ ! -d src/main/java/idv/lc/$1 ]; then
    mkdir src/main/java/idv/lc/$1
fi
if [ ! -d src/test/java/idv/lc/$1 ]; then
    mkdir src/test/java/idv/lc/$1
fi
sed 's/PKG_HOLDER/'$1'/g;s/CLASS_HOLDER/'$2'/g' src/main/java/idv/lc/temp > src/main/java/idv/lc/$1/$2.java
sed 's/PKG_HOLDER/'$1'/g;s/CLASS_HOLDER/'$2'/g' src/test/java/idv/lc/tempTest > src/test/java/idv/lc/$1/$2Test.java
