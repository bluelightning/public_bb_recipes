SUMMARY = "IO contains a number of the IO::X modules though mostly low-level ones"
AUTHOR = "Graham Barr <gbarr@pobox.com>"
HOMEPAGE = "https://metacpan.org/release/IO"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.yml;md5=72d18cde75dc488fa873036c9cdf9de4"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GB/GBARR/IO-${PV}.tar.gz"
SRC_URI[md5sum] = "b88aaf2bb7437725b11e9eb48dfb6c93"
SRC_URI[sha256sum] = "89790db8b9281235dc995c1a85d532042ff68a90e1504abd39d463f05623e7b5"

S = "${WORKDIR}/IO-${PV}"

inherit cpan

RPROVIDES_${PN} += "libio-dir-perl \
                    libio-file-perl \
                    libio-handle-perl \
                    libio-pipe-perl \
                    libio-poll-perl \
                    libio-seekable-perl \
                    libio-select-perl \
                    libio-socket-perl \
                    libio-socket-inet-perl \
                    libio-socket-unix-perl \
                    "

BBCLASSEXTEND = "native"
