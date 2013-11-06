SUMMARY = "Simple and efficient reading/writing/modifying of completed files"
AUTHOR = "Uri Guttman <uri@sysarch>"
HOMEPAGE = "https://metacpan.org/release/File-Slurp"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=a351ee318b059373ebde539a5bae495b"

SRC_URI = "http://cpan.metacpan.org/authors/id/U/UR/URI/File-Slurp-${PV}.tar.gz"
SRC_URI[md5sum] = "7d584cd15c4f8b9547765eff8c4ef078"
SRC_URI[sha256sum] = "ce29ebe995097ebd6e9bc03284714cdfa0c46dc94f6b14a56980747ea3253643"

S = "${WORKDIR}/File-Slurp-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
