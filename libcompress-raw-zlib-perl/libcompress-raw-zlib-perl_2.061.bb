SUMMARY = "Compress::Raw::Zlib - Low-Level Interface to zlib compression library"
AUTHOR = "Paul Marquees <pmqs@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Compress::Raw::Zlib"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=c445a24806d04c74a8c44b307cbfbae8"

SRC_URI = "http://cpan.metacpan.org/authors/id/P/PM/PMQS/Compress-Raw-Zlib-2.061.tar.gz"
SRC_URI[md5sum] = "b22987ac5e9ea3920d9abfbc57a9a60c"
SRC_URI[sha256sum] = "244804a39b93a18f5878e107c280f14a0263876d975e6146b9907b2ee4442319"

S = "${WORKDIR}/Compress-Raw-Zlib-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
