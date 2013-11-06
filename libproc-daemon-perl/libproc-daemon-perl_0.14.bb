SUMMARY = "JSON - JSON (JavaScript Object Notation) encoder/decoder"
AUTHOR = "Makamaka Hannyahramitu <makamaka@cpan.orgg"
HOMEPAGE = "https://metacpan.org/module/JSON"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=a432216a5556e140adfc7b2bac9020d4"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DE/DETI/Proc/Proc-Daemon-${PV}.tar.gz"
SRC_URI[md5sum] = "43eeb25f58b03b472942c06bdb34b7d2"
SRC_URI[sha256sum] = "8010d461a146b8c288a7b321e6e41e5b47b1774cae8cd7ee66cf2deca80b6f92"

S = "${WORKDIR}/Proc-Daemon-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

