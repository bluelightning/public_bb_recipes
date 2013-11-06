SUMMARY = "Digest::HMAC_SHA1 - Keyed-Hashing for Message Authentication"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/Digest::HMAC_SHA1"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=469ae6eca70dfeb46db5e5df73fc683d"

RDEPENDS_${PN} = "libdigest-md5-perl \
                 libdigest-sha-perl \
                 "

RPROVIDES_${PN} = "libdigest-hmac_md5-perl \
                  libdigest-hmac_sha1-perl \
                  "

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/Digest-HMAC-${PV}.tar.gz"
SRC_URI[md5sum] = "e6a5d6f552da16eacb5157ea4369ff9d"
SRC_URI[sha256sum] = "3bc72c6d3ff144d73aefb90e9a78d33612d58cf1cd1631ecfb8985ba96da4a59"

S = "${WORKDIR}/Digest-HMAC-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
