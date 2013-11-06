SUMMARY = "Test::Number::Delta - Compare the difference between numbers against a given tolerance"
AUTHOR = "David Golden <dagolden@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Test::Number::Delta"
SECTION = "libs"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a89fc6431f978476bd49e3f7a26a1a1e"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Test-Number-Delta-1.03.tar.gz"
SRC_URI[md5sum] = "17d3eec2d5bbe012c4a797af8e75ae39"
SRC_URI[sha256sum] = "9cd18d89bde4333f9f9b77668ef03e6e20d8ee5675c2ab1b216c7323419a320e"

S = "${WORKDIR}/Test-Number-Delta-${PV}"

inherit cpan

RDEPENDS_${PN} += "libtest-builder-perl \
                   libtest-builder-tester-perl \
                   "

BBCLASSEXTEND = "native"
