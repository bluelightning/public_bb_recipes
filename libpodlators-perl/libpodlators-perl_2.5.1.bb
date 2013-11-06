SUMMARY = "Plain-Old-Documentation (POD) modules"
AUTHOR = "Russ Allbery <rra@stanford.edu>"
HOMEPAGE = "https://metacpan.org/release/podlators"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.yml;md5=5a15d4a14692a794fc2797a90a760d11"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RR/RRA/podlators-${PV}.tar.gz"
SRC_URI[md5sum] = "9f79d07cf4ac26fd46be1d91a05a82aa"
SRC_URI[sha256sum] = "75b1adf32a39055bc819d1233fcea1f36642cf2db1e34396627289c6686198cb"

S = "${WORKDIR}/podlators-${PV}"

inherit cpan

RDEPENDS_${PN} += "libencode-perl \
                   libpod-simple-perl \
                   libfile-spec-perl \
                   "

RPROVIDES_${PN} += "libpod-man-perl \
                    libpod-parselink-perl \
                    libpod-text-perl \
                    libpod-text-perl \
                    libpod-text-color-perl \
                    libpod-text-overstrike-perl \
                    libpod-text-termcap-perl \
                    "

BBCLASSEXTEND = "native"
