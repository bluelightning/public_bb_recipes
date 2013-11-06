SUMMARY = "Recursively copy Perl datatypes"
AUTHOR = "Breno G. de Oliveira <garu@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Clone"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.yml;md5=f25055d2041749eb021a57cbfc3183ec"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GARU/Clone-${PV}.tar.gz"
SRC_URI[md5sum] = "22175ef74a6e5f5604cb74d1e4af456e"
SRC_URI[sha256sum] = "3d3d9eabfa6022dac8c9111097bebc7731e2e184457b5b55580bd5a3f6ef214a"

S = "${WORKDIR}/Clone-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
