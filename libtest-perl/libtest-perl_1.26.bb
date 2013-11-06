SUMMARY = "Test - provides a simple framework for writing test scripts"
AUTHOR = "Jesse Vincent <jesse+cpan@fsck.com>"
HOMEPAGE = "https://metacpan.org/module/Test"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=82da57b253d95f830de58fae58c3af4e"

RDEPEND_${PN} = "libfile-spec-perl \
                 libtest-harness-perl \
                "

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JE/JESSE/Test-${PV}.tar.gz"
SRC_URI[md5sum] = "6ec6583c34be3770edd466876546fb50"
SRC_URI[sha256sum] = "f7701bd28e05e7f82fe9a181bbab38f53fa6aeae48d2a810da74d1b981d4f392"

S = "${WORKDIR}/Test-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

