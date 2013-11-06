SUMMARY = "HTTP-Message contains a number of HTTP::X modules"
AUTHOR = "Gisle Aas <gisle@activestate.org>"
HOMEPAGE = "https://metacpan.org/release/HTTP-Message"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=2df4a321c77474ff5b3057bc5128573f"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Message-${PV}.tar.gz"
SRC_URI[md5sum] = "e563ac516e28d33f65bc0f295f625f85"
SRC_URI[sha256sum] = "087e97009c5239dca4631cf433d836771b3fc5ba5685eef1965f9d3415cbad63"

S = "${WORKDIR}/HTTP-Message-${PV}"

inherit cpan

RDEPENDS_${PN} += "libcompress-raw-zlib-perl \
                   libencode-perl \
                   libencode-locale-perl \
                   libhttp-date-perl \
                   libio-compress-bzip2-perl \
                   libio-compress-deflate-perl \
                   libio-compress-gzip-perl \
                   libio-html-perl \
                   libio-uncompress-bunzip2-perl \
                   libio-uncompress-gunzip-perl \
                   libio-uncompress-inflate-perl \
                   libio-uncompress-rawinflate-perl \
                   liblwp-mediatypes-perl \
                   libmime-base64-perl \
                   libmime-quotedprint-perl \
                   liburi-perl \
                   "

RPROVIDES_${PN} += "libhttp-headers-perl \
                    libhttp-config-perl \
                    libhttp-headers-util-perl \
                    libhttp-message-perl \
                    libhttp-request-perl \
                    libhttp-request-common-perl \
                    libhttp-response-perl \
                    libhttp-status-perl \
                    libhttp-headers-auth-perl \
                    libhttp-headers-etag-perl \
                    "
BBCLASSEXTEND = "native"
