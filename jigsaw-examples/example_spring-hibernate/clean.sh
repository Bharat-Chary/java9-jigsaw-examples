. ../env.sh

pushd src > /dev/null 2>&1

chmod a+x ../mvnw
../mvnw -e clean

popd >/dev/null 2>&1 